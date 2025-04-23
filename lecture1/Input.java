import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // キーボードから入力された名前を受け取り「ようこそ、（入力された名前）さん」と表示
        // 1. Scannerオブジェクトをプログラムから使える変数に代入
        Scanner scanner = new Scanner(System.in);
        // 2. 「お名前は？：」
        System.out.print("お名前は？：");
        // 3. 入力された名前を変数に代入
        String name = scanner.next();
        // 4. 「ようこそ、（入力された名前）さん」と表示
        System.out.println("ようこそ、" + name + "さん");
        // 5. Scannerオブジェクトを破棄（クローズ）
        scanner.close();
    }
}