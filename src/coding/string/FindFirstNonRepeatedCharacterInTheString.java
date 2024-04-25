package coding.string;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FindFirstNonRepeatedCharacterInTheString {
    public static void main(String[] args) {

        // find the first non repeated character in the string
        String str = "Ajay Vijay Sanjay";
      Optional<Character> firstNonRepeatedCharOptional = str.chars().mapToObj(c->Character.toLowerCase(Character.valueOf((char)c)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("First non repeated character in the string:"+firstNonRepeatedCharOptional.get());

    }
}
