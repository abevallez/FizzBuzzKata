public class FizzBuzz {

    public String convert(Integer number) {
        String conversion;
        if (number == 3) {
            conversion =  "Fizz";
        } else if (number == 5) {
            conversion = "Buzz";
        } else {
            conversion = number.toString();
        }
        return conversion;
    }
}
