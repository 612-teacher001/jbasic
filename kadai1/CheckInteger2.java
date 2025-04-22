import java.util.Scanner;

/**
 * Step2
 */
public class CheckInteger2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("xの値を入力してください：");
        int x = scanner.nextInt();
        System.out.print("yの値を入力してください：");
        int y = scanner.nextInt();

        String message = "";
        if (x > y) {
            message = "xはyより大きいです";
        } else if (x < y) {
            message = "xはyより小さいです";
        } else {
            message = "xとyは等しいです";
        }

        System.out.println(message);

        scanner.close();
    }
}