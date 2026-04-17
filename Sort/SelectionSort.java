package DSA.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,5,7,1,4,8,2};
        for(int i=0; i<arr.length; i++) //here i is the counter that how many elements are sorted
        {
            int end=arr.length-1-i;
            int max=largest(arr, 0,end);
            swap(arr,max,end);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int largest(int[] arr,int start, int end)
    {
        int max=start;
        for(int i=start; i<=end; i++)
        {
            if(arr[i]>arr[max]) max=i;
        }
        return max;
    }
    static void swap(int[] arr,int first, int second )
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
