package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        String expected = " 1  2  Fizz  4  Buzz  Fizz  7  8  Fizz  Buzz  11  Fizz  13  14  FizzBuzz  16  17  Fizz  19  Buzz  Fizz  22  23  Fizz ";
        String result = fizzBuzz.fizzBuzzList(25);
        
        Assertions.assertEquals(expected, result);
    }

}