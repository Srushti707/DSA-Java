package Recursion.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr={1,4,3,6,7};
        System.out.println(search(arr, 1, 0));
    }
    static int search(int[] arr,int target,int i)
    {
        if(i==arr.length) return -1;
        
        if( arr[i]==target) return i;
        return search(arr, target, i+1);

    }
}
