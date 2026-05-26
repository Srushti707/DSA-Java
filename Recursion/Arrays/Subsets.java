package Recursion.Arrays;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans= new ArrayList<>();
        subset(0, arr, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void subset(int i, int[] arr, List<Integer> list,List<List<Integer>> ans)
    {
        if(i>=arr.length) 
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        //pick
        list.add(arr[i]);
        subset(i+1, arr, list, ans);

        //Not pick
        list.remove(list.size()-1);
        subset(i+1, arr, list, ans);
    }
}
