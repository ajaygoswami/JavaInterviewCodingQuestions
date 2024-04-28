package coding.string;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(getLongestCommonPrefix(List.of("flower","floder")));
    }
    public static String getLongestCommonPrefix(List<String> strings){

     Integer lengthOfSmallestString= strings.stream().mapToInt(str->str.length()).min().getAsInt();
     String commonPrefix= "";
     boolean prefixMatch = true;
     for (int i = 0; i< lengthOfSmallestString;i++){
         if (prefixMatch) {
             char c = strings.get(0).charAt(i);
             for (String str : strings) {
                 if (str.charAt(i) != c) {
                     prefixMatch = false;
                 }
             }
             if (prefixMatch){
                 commonPrefix = commonPrefix+c;
             }
         }
    }
     return commonPrefix;

    }


}
