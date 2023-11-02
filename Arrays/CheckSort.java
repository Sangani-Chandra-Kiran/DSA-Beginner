package Arrays;
import java.util.*;

public class CheckSort {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length -1 ; i++) {
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
                
    }
    public static void main(String args[]) {
        int [] arr={5,6,7,8};
        System.out.println("Is the array sorted? "+isSorted(arr));
        int [] arr2={3,4,5,6,2};
        System.out.println("Is the array sorted? "+isSorted(arr2));
        }
}
