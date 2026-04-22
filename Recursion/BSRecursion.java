package Recursion;

public class BSRecursion {
    public static void main(String[] args) {
        int [] arr= {1,3,5,6,8,};
        int target=6;
        System.out.println(bs(0, arr.length-1, target, arr));
    }

    static int bs(int s,int e,int target, int[] arr)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return bs(s, mid-1, target, arr);
        else return bs(mid+1, e, target, arr);
    }
}
