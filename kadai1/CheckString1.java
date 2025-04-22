import java.util.Scanner;

public class CheckString1 {
    public static void main(String[] args) {
        // Scannerオブジェクトをプログラムから使える状態に準備
        Scanner scanner = new Scanner(System.in);

        System.out.print("パスワード：");
        String password = scanner.next();

        String message = "";
        if (password.equals("himitu")) {
            message = "一致しました";
        } else {
            message = "一致しませんでした";
        }

        System.out.println(message);

        // Scannerオブジェクトの後片付け
        scanner.close();
    }
}