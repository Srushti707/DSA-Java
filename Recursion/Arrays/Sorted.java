package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr= {1,2,4,3,6,7};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int i)
    {
        if(i==arr.length-2) return true;
        if(arr[i]<arr[i+1]) return isSorted(arr, i+1);
        else return false;
    }
}
