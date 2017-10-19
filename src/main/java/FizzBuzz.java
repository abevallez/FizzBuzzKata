public class FizzBuzz {

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
