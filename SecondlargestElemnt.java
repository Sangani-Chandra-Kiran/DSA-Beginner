

import java.util.*;

public class SecondlargestElemnt {

    public static void main(String[] args) {
        int arr []= {3,9,6,15,12};
        int n= arr.length-1;
        for (int i=0;i<=n;i++){
            Arrays.sort(arr);
                    System.out.println("Array after sorting:"+arr[i]);

        }
        //print sorted array
        
        System.out.println("Second largest element is "+arr[n-1]);

    }
}