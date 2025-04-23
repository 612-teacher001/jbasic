public class Quiz1 {
    public static void main(String[] args) {
        int score = 98;
        Styring judge = "";
        if (score >= 90) {
            judge = "優";
        }
        if (80 <= score && score < 90) {
            judge = "良";
        }
        
        if (60 <= score score < 80) {
            judge = "可";
        }

        if (score < 60) {
            judge = "付加";
        }

        System.out.println(judge);

    }
}