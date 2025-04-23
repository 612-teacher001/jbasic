public class Introduce2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("情報を登録します");
            System.out.print("氏名：");
            String name = scanner.next();
            String[] hobbies = new String[3];
            System.out.print("趣味1：");
            hobbies[0] = scanner.next();
            System.out.print("趣味2：");
            hobbies[1] = scanner.next();
            System.out.print("趣味3：");
            hobbies[2] = scanner.next();

            System.out.println("---");

            System.out.println("こんにちは" + name + "です");
            System.out.println("私の趣味は");
            
            for (String hobby : hobbies) {
                System.out.println("・" + hobby);
            }

            System.out.println("です");



        }
    }
}