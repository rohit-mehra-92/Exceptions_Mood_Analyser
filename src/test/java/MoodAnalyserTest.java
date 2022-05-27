import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenMessage_analyseSadMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_analyseHappyMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_analyseSadMood_usingConstructor() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMoodAgain();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_analyseHappyMood_usingConstructor() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMoodAgain();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenNullMood_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMoodAgain();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    void givenNullMood_throwsExceptions() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMoodAgain();
        }catch (MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionTypes.ENTERED_NULL, e.types);
        }
    }
}
