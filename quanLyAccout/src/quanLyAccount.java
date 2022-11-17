import java.util.Scanner;

public class quanLyAccount {
    Account[] account = new Account[0];

    public void show() {
        for (int i = 0; i < account.length; i++) {
            System.out.println(account[i]);
        }
    }

    public void add(Account accounts1) {
        Account[] newArr = new Account[account.length + 1];
        for (int i = 0; i < account.length; i++) {
            newArr[i] = account[i];
        }
        newArr[newArr.length - 1] = accounts1;
        account = newArr;
    }

    public Account createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tạo tài khoản");
        System.out.println("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập username");
        String name = scanner.nextLine();
        System.out.println("Nhập pass");
        String password = scanner.nextLine();
        System.out.println("Nhập phone");
        String phone = scanner.nextLine();
        System.out.println("Nhập date");
        String date = scanner.nextLine();
        Account account1 = new Account(id, name, password, phone, date);
        return account1;
    }
    public int find(String username) {
        for (int i = 0; i < account.length; i++) {
            if (username.equals(account[i].getUsername())) {
                return i;
            }
        }
        return -1;
    }
    public void delete(String username) {
        System.out.println("nhập username muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int index = find(username);
        if (index != -1){
            Account[] newArr = new Account[account.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if(i < index){
                    newArr[i] = account[i];
                }else {
                    newArr[i] = account[i + 1];
                }
            }
            account = newArr;
        }
    }
    public void edit(String username) {
        Scanner scanner = new Scanner(System.in);
        int index = find(username);
        if (index != -1) {
            System.out.println("đổi password");
            String password = String.valueOf(scanner.nextLine());
            account[index].setPassword(password);
        }
    }
}
