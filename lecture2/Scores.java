public class Scores {
    public static void main(String[] args) {
        // 点数の配列の宣言とプログラムで制御できる形式への準備
        int[] scores = new int[3];
        // 国語の点数を格納
        scores[0] = 58;
        // 数学の点数を格納
        scores[1] = 29;
        // 英語の点数を格納
        scores[2] = 75;
        
        // // 英語の点数を表示
        // System.out.println(scores[2]);

        // // 3科目の合計点sumを表示：「合計点は〇〇点です」
        // int sum = scores[0] + scores[1] + scores[2];
        // System.out.println("合計点は " + sum + " 点です");

//        System.out.println(scores);
        int[] remarks = new int[3];
        scores[1] = 99;
        System.out.println(remarks);
        System.out.println(remarks[3]);



    }
}