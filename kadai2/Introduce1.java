public class Introduce1 {
    public static void main(String[] args) {
        System.out.println("私の趣味は");
        String[] hobbyList = {"ダンス", "映画", "バイク"};
        for (String hobby : hobbyList) {
            System.out.println("・" + hobby);
        }
        System.out.println("です");
    }
}