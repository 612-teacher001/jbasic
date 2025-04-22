import java.util.Scanner;

public class CheckInteger3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力してください：");
        int age = scanner.nextInt();

        String message = "";
        if (0 <= age && age <= 130) {
            message = "正しい年齢です";
        } else {
            message = "0～130で入力してください";
        }
        System.out.println(message);
        scanner.close();

    }
}