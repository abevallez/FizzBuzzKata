public class FizzBuzz {

    /**
     * Convert to string when number is not multiple of 3 nor 5
     * Convert to Fizz when number is multiple of 3
     * Convert to Buzz when number is multiple of 5
     *
     * @param number
     * @return
     */
    public String convert(Integer number) {
        String conversion;
        if (isMultipleOf3(number)) {
            conversion =  "Fizz";
        } else if (isMultipleOf5(number)) {
            conversion = "Buzz";
        } else {
            conversion = number.toString();
        }
        return conversion;
    }

    private boolean isMultipleOf5(Integer number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(Integer number) {
        return number % 3 == 0;
    }
}
