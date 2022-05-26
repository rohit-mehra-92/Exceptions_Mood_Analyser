public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return "HAPPY";
    }

    public String analyseMoodAgain() {
        return analyseMood(this.message);
    }
}

