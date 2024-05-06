package coding.frequentlyaskedalgos;

public class BinarySearch {

    public static void main(String[] args) {
      int[] sortedArray = {1,2,3,4,5,6,7,8,9,10,11,22,44,55};
        System.out.println(searchGivenNumberIndexInArray(sortedArray,1));
    }

    public static int searchGivenNumberIndexInArray(int[] arr, int numToFind){

        int length = arr.length;
        int start = 0;
        int last = length - 1;
        int index = Integer.MAX_VALUE;

        while(start <= last){
            int mid = start + (last - start)/2;
            if (arr[mid]< numToFind){
                start = mid + 1;
            } else if (arr[mid] > numToFind) {
                last = mid -1 ;
            } else if (arr[mid] == numToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
