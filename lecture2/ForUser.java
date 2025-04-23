public class ForUser {
    public static void main(String[] argv) {
        int[] scores = {58, 29, 75, 87, 98, 83};
        String[] subjects = {"国語", "数学", "英語", "理科", "社会", "体育"};

        int sum = 0;

        int intLength = scores.length;
        for (int i = 0; i < intLength; i++) {
            // 「≪科目名≫は≪点数≫点です」
            System.out.println(subjects[i] + "は" + scores[i] + "点です");
            // 合計点に加算
            sum = sum + scores[i]; // sum += scores[i]; 
        }

        for (String subject : subjects) {
            if (subject.equals("英語")) {
                continue;
            }
            System.out.println(subject);
        }

        double average = ((double)sum) / intLength;

        // 合計点と平均点を表示：「合計は≪合計点≫点です」「平均は≪平均点≫点です」
        System.out.println("合計点は" + sum + "点です");
        System.out.println("平均点は" + average + "点です");

    }
}