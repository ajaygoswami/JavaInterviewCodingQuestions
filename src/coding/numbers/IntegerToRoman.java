package coding.numbers;

import java.util.*;

public class IntegerToRoman {

    public static final int[]INTEGERS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static final String[] ROMANS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static void main(String[] args) {
        System.out.println(integerToRoman(9999));
    }

    public static String integerToRomanUsingRecursion(Integer num) {

        for (int i = 0; i < INTEGERS.length; i++) {
            if (num >= INTEGERS[i]) {
                return ROMANS[i] + integerToRomanUsingRecursion(num - INTEGERS[i]);
            }
        }
        return "";
    }

    public static String integerToRoman(Integer num) {

        StringBuilder roman  = new StringBuilder();
        int i = 0;
        while(num>0 && i< INTEGERS.length){
            if (num>= INTEGERS[i]){
                roman.append(ROMANS[i]);
                num -= INTEGERS[i];
            }else {
                i++;
            }
        }
        return roman.toString();
    }
}
