package Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {3,1,2,0};
        int i=0;
        
        while(i<arr.length)
        {
            int correctIndex= arr[i];
            System.out.println(correctIndex);
            if(arr[i]!= arr[correctIndex]) swap(arr,i, correctIndex);
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first , int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
