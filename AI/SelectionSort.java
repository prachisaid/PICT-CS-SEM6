import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};  
        selection(arr); 
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // swapped with the last index
            int last = arr.length-i-1;
            int maxInd = getMaxIndex(arr, 0, last);
            swap(arr, maxInd, last);
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

}
