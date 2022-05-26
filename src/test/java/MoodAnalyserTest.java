import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest<mood> {

    @Test
    void givenMessage_analyseSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_analyseHappyMood() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_analyseSadMood_usingConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMoodAgain();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_analyseHappyMood_usingConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMoodAgain();
        Assertions.assertEquals("HAPPY", mood);
    }
}
