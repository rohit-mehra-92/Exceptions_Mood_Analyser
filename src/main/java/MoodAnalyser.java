public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionTypes.ENTERED_EMPTY, "Please check your mood");

            else if (message.toLowerCase().contains("sad"))
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

