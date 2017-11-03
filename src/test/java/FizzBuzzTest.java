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
            "20",
    })
    public void shouldReturnBuzzWhenNumberMultipleOf5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    @Parameters({
            "15",
            "30",
    })
    public void shouldReturnFizzBuzzWhenNumberMultipleOf3And5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({
            "13",
            "23",
            "83"
    })
    public void shouldReturnFizzWhenNumberContain3(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    @Parameters({
            "52",
            "58"
    })
    public void shouldReturnBuzzWhenNumberContain5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    @Parameters({
            "534",
            "582"
    })
    public void shouldReturnFizzBuzzWhenNumberContain3And5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({
            "35",
            "535"
    })
    public void shouldReturnFizzBuzzWhenNumberContain3or5AndMultipleOf3And5(Integer number) {
        String result = fizzBuzz.convert(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
