public class MoodAnalyser {

    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

