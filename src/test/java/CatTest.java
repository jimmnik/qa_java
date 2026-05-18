import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;
    Cat cat;

    @BeforeEach
    void setUp(){
        cat = new Cat(feline);
    }

    @Test
    void getSound_shouldReturnMeow(){
        // Arrange
        String expectedResult = "Мяу";
        // Act
        String actualResult = cat.getSound();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getFood_shouldReturnPredatorFood() throws Exception {
        // Arrange
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        // Act
        List<String> actualResult = cat.getFood();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(feline).eatMeat();
    }
}
