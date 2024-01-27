package basics;

public class FizzBuzz {

    public String fizzBuzzList(int max) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < max; i++) {
            sb.append(" " + fizzBuzz(i) + " ");
        }
        return sb.toString();
    }

    public String fizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if(number % 3 == 0) {
            return "Fizz";
        }

        if(number % 5 == 0) {
            return "Buzz";
        }

        return number + "";
    }
}