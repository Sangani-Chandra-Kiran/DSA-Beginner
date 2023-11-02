package Arrays;
import java.io.*;
/**
 * Approach for Second Small and largeElement
 * lets declare 2 variables as Integer.MAX_VALUE
 * If the current element is smaller than ‘small’, then we update second_small and small variables
 * Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
 * Once we traverse the entire array, we would find the second smallest element in the variable second_small.
 */
/**
 * SecondLargeandSmallElement
 */
public class SecondLargeandSmallElement {

    static private int secondSmallest(int[] arr, int n) {
    
        if(n<2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i]!=small){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    static private int SecondLargest(int [] arr, int n) {
        if (n<2){
            return -1;
        }

        int Large = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
    
        for(int i=0; i<n; i++){
            if(arr[i] > Large){
                secondlargest = Large;
                Large = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!= Large){
                secondlargest = arr[i];
            }
        }
        return secondlargest;

    }
    
    public static void main(String[] args){
    int [] arr = {9,12,15,6,3};
    int n = arr.length;
    int sS = secondSmallest(arr,n);
    int sL = SecondLargest(arr,n);
    System.out.println("Second Smallest Element is" + sS);
    System.out.println("Second Largest Element is" + sL);


}

    
}

