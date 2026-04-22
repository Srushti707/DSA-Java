package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {3,5,7,1,4,8,2};

        for(int i=0; i<arr.length; i++) //here i is the counter that tells how many elements are sorted
        {
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
