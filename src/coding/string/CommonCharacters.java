package coding.string;

import java.util.*;
import java.util.stream.*;

public class CommonCharacters {
    public static void main(String[] args) {
        String[] words = {"coo","lock","cook"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        int longestWordLength = Stream.of(words).map(String::length).mapToInt(n->n).max().getAsInt();
        String longestWord = Stream.of(words).filter(s-> s.length()==longestWordLength).findFirst().get();
        List<String> commonChars = new ArrayList<>();
        for (int i = 0 ; i < longestWordLength ; i++) {
            char c = longestWord.charAt(i);
            int count = 0;
            for (String str: words){
                if (str.contains(String.valueOf(c))){
                    count++;

                }
            }
            if (count == words.length){
                commonChars.add(String.valueOf(c));
            }
            count=0;
        }
        return commonChars;
    }


}
