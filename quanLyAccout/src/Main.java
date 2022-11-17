import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static quanLyAccount quanLyAccount = new quanLyAccount();
    public static void main(String[] args) {

        while (true){
            System.out.println("Quản lí account");
            System.out.println("1. thêm tài khoản");
            System.out.println("2. đổi mật khẩu");
            System.out.println("3. xóa tài khoản");
            System.out.println("4. tìm tài khoản");
            System.out.println("5. hiển thị");
            System.out.println("6. thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Account account1 = quanLyAccount.createAccount();
                    quanLyAccount.add(account1);
                    break;
                case 2:
                    System.out.println("sửa tên");
                    String username = scanner.nextLine();
                    quanLyAccount.edit(username);
                    break;
                case 3:
                    System.out.println("xóa tên");
                    String name1 = scanner.nextLine();
                    quanLyAccount.delete(name1);
                    break;
                case 4:
                    System.out.println("tìm");
                    String name = scanner.nextLine();
                    quanLyAccount.find(name);
                    break;
                case 5:
                    quanLyAccount.show();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}