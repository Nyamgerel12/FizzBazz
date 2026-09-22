import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test 
    void convert_regularNumber_returnsNumberAsString(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));

    }
    @Test
    void convert_multipleOfThree_returnsFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }
}
