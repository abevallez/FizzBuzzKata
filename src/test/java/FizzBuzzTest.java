import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturn1When1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer result = fizzBuzz.convert(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn2When2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer result = fizzBuzz.convert(2);
        assertThat(result).isEqualTo(2);
    }
}
