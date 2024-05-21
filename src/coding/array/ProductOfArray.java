package coding.array;

import java.util.*;
import java.util.stream.*;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArray3(arr)));
    }
    private static int[] productOfArray(int[] arr){
        int[] productArray = new int[arr.length];
        for (int i = 0 ; i< arr.length ; i++){
            int valueToIgnore = arr[i];
            int sumExceptGivenIndexValue = Arrays.stream(arr).filter(n-> n !=valueToIgnore).reduce(1,(n1,n2)->n1*n2);
            productArray[i]=sumExceptGivenIndexValue;
        }
        return productArray;
    }

    private static int[] productOfArray2(int[] arr){
        int[] productArray = new int[arr.length];
        for (int i = 0 ; i< arr.length ; i++){
           int valueToIgnore = arr[i];
           int product = 1;
            for (int value : arr){
                if (value != valueToIgnore){
                    product *= value;
                }
            }
            productArray[i]=product;
        }
        return productArray;
    }
    private static int[] productOfArray3(int[] arr){
        int[] productArray = new int[arr.length];
        int i = 0;
        for (int elementToIgnore: arr){
            productArray[i] = Arrays.stream(arr).filter(n-> n !=elementToIgnore).reduce(1,(n1,n2)->n1*n2);
            i++;
        }
      return  productArray;
    }
}
