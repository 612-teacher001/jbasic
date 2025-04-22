import java.util.Scanner;

public class CheckInteger4 {
    public static void main(String[] args) {
        // Scannerオブジェクトをプログラムから使える状態に準備
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください：");
        int target = scanner.nextInt();

        String message = target + "は";
        // 正負判定
        if (target >= 0) {
            message = message + "正の";
        } else {
            message = message + "負の";
        }
        // 偶奇判定
        if (target % 2 == 0) {
            message = message + "偶数";
        } else {
            message = message + "奇数";
        }
        message = message + "です";

        System.out.println(message);

        // Scannerオブジェクトの後片付け
        scanner.close();
    }
}