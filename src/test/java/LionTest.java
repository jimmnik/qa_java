import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class LionTest{

    @Mock
    Feline feline;

    @Test
    public void constructor_IncorrectSex_ReturnException(){
        // Arrange
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        // Act
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> new Lion("Котенок", feline)
        );
        // Assert
        Assertions.assertEquals(expectedResult, exception.getMessage());
    }

    @Test
    public void getKittens_shouldReturnOneKittens() throws Exception {
        // Arrange
        int expectedResult = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedResult);
        Lion lion = new Lion("Самец", feline);
        // Act
        int actualResult = lion.getKittens();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getFood_shouldReturnPredatorFood() throws Exception{
        // Arrange
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        Lion lion = new Lion("Самец", feline);
        // Act
        List<String> actualResult = lion.getFood();
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
        Mockito.verify(feline).getFood("Хищник");
    }
}
