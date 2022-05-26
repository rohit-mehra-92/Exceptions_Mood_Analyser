public class Main {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String sadMood = moodAnalyser.analyseMood("i am in sad mood");
        System.out.println(sadMood);

        String happyMood = moodAnalyser.analyseMood("i am in happy mood");
        System.out.println(happyMood);

        MoodAnalyser moodAnalyser1 = new MoodAnalyser(null);
        String nullMood = moodAnalyser1.analyseMoodAgain();
        System.out.println(nullMood);

    }

}
