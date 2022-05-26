public class Main {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String sadMood = moodAnalyser.analyseMood("i am in sad mood");
        System.out.println(sadMood);

    }

}
