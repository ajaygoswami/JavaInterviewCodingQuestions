package coding.string;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FindLongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabbaa"));
    }

    public static String longestPalindrome(String str){
        if (str.isBlank()){
            return "Input is empty";
        }
        List<String> allPalindromes = new ArrayList<>();
        int longestPalindromeLength = 0;
        String longestPalindrome= "";
        for (int i = 0 ; i < str.length() ; i++){
            for (int j =i+1 ; j < str.length(); j++){
                String subString = str.substring(i,j+1);
               if(isPalindrome(subString)){
                   int length = subString.length();
                   if (length>longestPalindromeLength){
                       longestPalindromeLength = length;
                       longestPalindrome = subString;
                   }
               }
            }
        }
       return longestPalindrome;
    }

    public static Boolean isPalindrome(String str){
         return str.equals(new StringBuilder(str).reverse().toString());
    }
}
