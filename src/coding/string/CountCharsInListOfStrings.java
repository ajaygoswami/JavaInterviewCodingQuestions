package coding.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsInListOfStrings {
    public static void main(String[] args) {
        //count chars in given list of strings
        List<String> stringList= Arrays.asList("Ajay","Sen","Goswami","SriNagar");
        Map<String, Long> charCountInListOfStrings=  stringList.stream()
                .map(str->Arrays.asList(str.toLowerCase().split("")))
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCountInListOfStrings);
    }
}
