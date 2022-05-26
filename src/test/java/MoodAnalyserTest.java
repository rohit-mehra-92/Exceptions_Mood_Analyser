import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenMessage_analyseSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_AnalyseHappyMood() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
