import java.util.Scanner;

public class CheckInteger4 {
    public static void main(String[] args) {
        // Scannerオブジェクトをプログラムから使える状態に準備
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください：");
        int target = scanner.nextInt();

        String message = target + "は";
        if (target >= 0) {
            // 0以上の場合
            if (target % 2 == 0) {
                // 偶数の場合
            } else {
                // 奇数の場合
            }
        } else {
            // 負の場合
            if (target % 2 == 0) {
                // 偶数の場合
            } else {
                // 奇数の場合
            }

        }

        message = message + "です";

        System.out.println(message);

        // Scannerオブジェクトの後片付け
        scanner.close();
    }
}