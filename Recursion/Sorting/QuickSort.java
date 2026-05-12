package Recursion.Sorting;
import java.util.*;

public class QuickSort {
    static void quickSort(int[] arr,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int p= partition(arr,start,end);
        quickSort(arr,start,p-1);
        quickSort(arr,p+1,end);
    }

    static int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int i=start-1; //position where small elements should go

        for(int j=start; j<end; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
