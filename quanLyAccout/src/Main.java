import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        qLyAccount qLyAccount = new qLyAccount();
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("menu");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Đổi pass");
        System.out.println("4. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    qLyAccount.DangNhap();
                    break;
                case 2:
                    Account account = qLyAccount.TaoAccount();
                    qLyAccount.DangKy(account);
                    break;
                case 3:
                    qLyAccount.DoiPass();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }
}
