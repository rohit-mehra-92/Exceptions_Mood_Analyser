public class MoodAnalyserException extends Exception {
       enum ExceptionTypes {
        ENTERED_NULL,
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
