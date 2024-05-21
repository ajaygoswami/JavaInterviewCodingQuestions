package coding.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOfCharactersInAGivenString {
    public static void main(String[] args) {
  //get count of chars in string
        String str = "Ajay Sen Goswami";

    Map<String, Long> charCountInString=    Stream.of(str.toLowerCase().split(" "))
                        .map(s-> Arrays.asList(s.split("")))
                                .flatMap(Collection::stream)
                                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charCountInString);
    }
}
