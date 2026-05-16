import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AlexTest {
    @Mock
    private Alex alex;
    private Feline feline;

    @BeforeEach
    void setUp() throws Exception {
        feline = new Feline();
        alex = new Alex(feline);
    }

    @Test
    void getFriends_shouldReturnAlexFriends() {
        // Arrange
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        // Act
        List<String> actualResult = alex.getFriends();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getPlaceOfLiving_shouldReturnZoo() {
        // Arrange
        String expectedResult = "Нью-Йоркский зоопарк";
        // Act
        String actualResult = alex.getPlaceOfLiving();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getKittens_shouldReturnZero() {
        // Arrange
        int expectedResult = 0;
        // Act
        int actualResult = alex.getKittens();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}