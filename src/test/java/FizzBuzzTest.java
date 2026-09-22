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
    @Test 
    void convert_multipleOfFive_returnsBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }
    @Test 
    void convert_multipleOfThreeAndFive_returnsFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}
