
// Approach

/*
 * sort the array in ascending order
 * the second element is 2nd smallest element in array
 * the second largest is last but 1st element in array
 */
import java.util.*;

public class SecondlargestandsmallestElement {

    public static void main(String[] args) {
        int arr []= {3,9,6,15,12};
        int n= arr.length-1;
        for (int i=0;i<=n;i++){
            Arrays.sort(arr);
                    System.out.println("Array after sorting:"+arr[i]);

        }     
        System.out.println("Second smallest element is "+arr[1]);   
        System.out.println("Second largest element is "+arr[n-1]);

    }
}

