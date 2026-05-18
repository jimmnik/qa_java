import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FelineParameterizedTest {

    @ParameterizedTest(name = "kittensCount = {0}")
    @CsvSource({
            "1",
            "2",
            "5"
    })
    void getKittens_shouldReturnPassedCount(int kittensCount){
        // Arrange
        int expectedResult = kittensCount;
        Feline feline = new Feline();
        // Act
        int actualResult = feline.getKittens(kittensCount);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
