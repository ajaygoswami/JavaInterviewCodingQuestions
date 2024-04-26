package coding.numbers;

import java.util.*;

public class FizzBuzzProblem {

    public static void main(String[] args) {
        System.out.println(getFizzBuzzResult(15));
    }

    public static List<String> getFizzBuzzResult(Integer num){
        final List<String> result = new ArrayList<>();
        for (int i= 1 ; i <= num ; i++){
            if (i%3==0 && i%5==0){
                result.add("FizzBuzz");
            } else if (i%3==0) {
                result.add("Fizz");
            }else if (i%5==0) {
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
