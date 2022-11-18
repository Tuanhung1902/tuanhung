import java.util.HashMap;
import java.util.Scanner;

public class qLyAccount {
    Account account = new Account();
    HashMap<String, Account> ArrAccount = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public Account TaoAccount() {
        Account account1 = new Account();
        System.out.println("Nhập username");
        String username = String.valueOf(scanner.nextLine());
        System.out.println("Nhập password");
        String password = String.valueOf(scanner.nextLine());
        if (ArrAccount.containsKey(username)) {
            System.out.println("đã có username");
        } else {
            account1 = new Account(username, password);
        }
        return account1;
    }

    public void DangKy(Account account3) {
        ArrAccount.put(account3.getUsername(), account3);
    }

    public void DangNhap() {
        System.out.println("Nhập username");
        String username = String.valueOf(scanner.nextLine());
        System.out.println("Nhập password");
        String password = String.valueOf(scanner.nextLine());
        if (ArrAccount.containsKey(username)) {
           while (!password.equals(ArrAccount.get(username).getPassword())){
               System.out.println("nhập lại mật khẩu");
                password = String.valueOf(scanner.nextLine());
           }
        }else {
            System.out.println("không có tài khoản");
        }
    }
    public void DoiPass(){
        ArrAccount.get(account.getUsername()).setPassword(String.valueOf(scanner.nextLine()));
    }
}
