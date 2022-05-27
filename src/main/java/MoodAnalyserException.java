public class MoodAnalyserException extends Exception {
       enum ExceptionTypes {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionTypes types;

    public MoodAnalyserException(String message) {
        super(message);
    }

    public MoodAnalyserException(ExceptionTypes types, String message) {
        super(message);
        this.types = types;
    }
}
