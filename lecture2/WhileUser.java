public class WhileUser {
    public static void main(String[] args) {
        // 3科目のテストの点数を格納する配列を生成
        int[] scores =new int[] {58, 29, 75, 87, 98, 83}; // 配列リテラル
        int intLength = scores.length;
        // 1～10までの整数を表示する
        // 0～2までの整数を表示する
        int i = 0;
        while (i < intLength) {
            System.out.println(scores[i]);
            i++;
        }
    }
}