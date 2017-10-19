public class FizzBuzz {

    public String convert(int number) {
        String conversion;
        if (number == 3) {
            conversion =  "Fizz";
        } else if (number == 2) {
            conversion =  "2";
        } else {
            conversion = "1";
        }
        return conversion;
    }
}
