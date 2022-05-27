public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionTypes.ENTERED_NULL, "Please check your mood");
        }
        return "HAPPY";
    }

    public String analyseMoodAgain() throws MoodAnalyserException {
        return analyseMood(this.message);
    }
}

