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
    public void shouldReturnNumberAsStringWhenNumberNotMultipleOf3nor5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo(number.toString());
    }

    @Test
    @Parameters({
            "3",
            "6",
            "9",
    })
    public void shouldReturnFizzWhenNumberMultipleOf3(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    @Parameters({
            "5",
            "10",
            "20"
    })
    public void shouldReturnBuzzWhenNumberMultipleOf5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("Buzz");
    }
}
