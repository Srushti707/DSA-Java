package DSA.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {3,5,7,1,4,8,2};

        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(i);
            for(int j=i+1; j>0; j--)
                {
                    if(arr[j]<arr[j-1])
                        {
                            swap(arr,j,j-1);
                            System.out.println(Arrays.toString(arr));
                        }
                }   
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
