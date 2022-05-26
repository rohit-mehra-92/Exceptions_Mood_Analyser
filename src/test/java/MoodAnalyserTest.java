import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenMessage_shouldReturnSad() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = MoodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }
}
