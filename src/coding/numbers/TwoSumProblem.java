package coding.numbers;

import java.util.*;

public class TwoSumProblem {

    public static void main(String[] args) {
        //Given an integer number array, we need to find out the indexes of
        // the two numbers which sum equals the given target number

        int[] intArr = {1,2,3,4,5,6,7,8,9};
        int targetNumber = 15;
        System.out.println( Arrays.toString(getIndexesOfMatchedNumbers(intArr,targetNumber)));
    }
    public static int[] getIndexesOfMatchedNumbers(int[] intArr, int target){
        int i = 0 ;
        while(i< intArr.length) {
            for (int j = 1; j < intArr.length; j++) {
                if (intArr[i] + intArr[j] == target) {
                    return new int[]{i,j};
                }
            }
            i++;
        }
       throw new IllegalArgumentException("Two sum solution not available");
    }
}
