public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

     public MoodAnalyser() {
    }

    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public String analyseMoodAgain() {
        return analyseMood(this.message);
    }
}

