package Recursion;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[]arr)
    {
        if(arr.length==1) return arr;
        int mid=arr.length /2;

        int[] right=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] left=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(right, left);
    }
    static int[] merge(int[]right, int[]left)
    {
        int i=0,j=0,k=0;
        int[] merged=new int[right.length+left.length];
        while(i<right.length && j<left.length)
        {
            if(right[i]<left[j])
                {
                    merged[k]=right[i];
                    i++;
                }
            else
                {
                    merged[k]=left[j];
                    j++;
                }
                k++; 

            //any of the array will be left to merged
        }
        while(i<right.length)
        {
            merged[k]=right[i];
            i++;
            k++;
        }
        while(j<left.length)
        {
            merged[k]=left[j];
            j++;
            k++;
        }
        return merged;
    }

}
