package coding.array;

import java.util.*;

public class A3SumProblem {

    public static void main(String[] args) {
      int[] arr = {-1,0,1,2,-1,-4};
        System.out.println( getUniqueTriplets(arr));
    }
    private static Set<List<Integer>> getUniqueTriplets(int[] arr){
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < arr.length ; i++){
            for (int j = i+1; j< arr.length; j++){
                for (int k=j+1 ; k < arr.length; k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        List<Integer> oneResult =  new ArrayList<>();
                        oneResult.add(arr[i]);
                        oneResult.add(arr[j]);
                        oneResult.add(arr[k]);
                        Collections.sort(oneResult);
                        result.add(oneResult);
                    }
                }
            }
        }
        return result;
    }
}
