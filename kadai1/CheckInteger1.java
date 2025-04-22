import java.util.Scanner;

/**
 * Step1
 */
public class CheckInteger1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください：");
        int number = scanner.nextInt();
        if (number == 7) {
            System.out.println("大当たり！");
        } else {
            System.out.println("ハズレ");
        }
        scanner.close();
    }
}