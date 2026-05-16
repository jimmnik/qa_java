import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LionParameterizedTest {

    @ParameterizedTest(name = "sex={0}, expectedMane={1}")
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void constructorAndDoesHaveMane_ReturnCorrectManeBasedOnSex(String sex, boolean expectedMane) throws Exception {
        // Arrange
        Feline feline  = new Feline();
        Lion lion = new Lion(sex, feline);
        // Act
        boolean actualMane = lion.doesHaveMane();
        // Assert
        Assertions.assertEquals(expectedMane, actualMane);
    }
}