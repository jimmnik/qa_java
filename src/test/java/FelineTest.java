import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FelineTest {

    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void getKittens_shouldReturnOneKittens(){
        // Arrange
        int expectedResult = 1;
        // Act
        int actualResult = feline.getKittens();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getFamily_shouldReturnFelineFamily(){
        // Arrange
        String expectedResult ="Кошачьи";
        // Act
        String actualResult = feline.getFamily();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void eatMeat_animalKingPredator_shouldReturnPredatorFood() throws Exception {
        // Arrange
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        // Act
        List<String> actualResult = feline.eatMeat();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
