import static org.assertj.core.api.Assertions.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    /**
     * FizzBuzz
     */
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @Parameters({
        "1",
        "2",
        "4",
        "7",
    })
    public void shouldReturnNumberAsStringWhenNumberNotMultipleOf3Or5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo(number.toString());
    }

    @Test
    public void shouldReturnFizzWhen3() {
        String result = fizzBuzz.convert(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnBuzzWhen5() {
        String result = fizzBuzz.convert(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzWhen6() {
        String result = fizzBuzz.convert(6);
        assertThat(result).isEqualTo("Fizz");
    }

}
