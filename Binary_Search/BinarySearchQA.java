package Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchQA {
    public static void main(String[] args) {

        //744. Smallest letter greater than target

    //     char[] letters = {'c','d','e','f','g','h','i'};
    //     char target='i';
    //     System.out.println(nextGreatestLetter(letters,target));



    // }

    // static char nextGreatestLetter(char[] letters, char target) {
        
    //     int start=0;
    //     int end=letters.length-1;
    //     while(start<=end)
    //         {
    //         int mid=start+(end-start)/2;
    //         if(letters[mid]<=target)
    //         {
    //             start=mid+1;
    //         }
    //         else
    //         {
    //             end=mid-1;
    //         }
            
    //     }

    // return letters[start % letters.length];

    //34. Find first and last position of an element in sortted array

    // int[] nums={5,7,7,7,7,8,8,10};
    // int target=7;
    // System.out.println(Arrays.toString(searchRange(nums,target)));


    // static public int[] searchRange(int[] nums, int target) {
    //     int[] ans={-1,-1};
    //     int start=search(nums,target,true);
    //     int end=search(nums,target,false);
    //     ans[0]=start;
    //     ans[1]=end;
    //     return ans;
        
    // }

    // static int search(int[] nums, int target ,boolean searchStartIndex) 
    // {
    //     int start =0;
    //     int end=nums.length-1;
    //     int ans=-1 ;

    //     while (start<=end) 
    //         {
    //          int mid=start+(end-start)/2;
    //          if(nums[mid]<target)
    //          {
    //             start= mid+1;
    //          }
    //          else if(nums[mid]>target)
    //          {
    //             end=mid-1;
    //          }
    //          else{
    //             ans= mid;
    //             if(searchStartIndex)
    //             {
    //                 end=mid-1;
    //             }
    //             else
    //             {
    //                 start=mid+1;
    //             }


    //          }
    //         }
        
    //         return ans;
    // }



    // }

    //Find position of an element in a sorted array of infinite numbers

    // int[] arr={1,3,5,7,9,10,15,17,19,20,23,25,27,29,30,31,34,35,37,39,40,41,43,44,46,47,48,49,50,56,67,89,100};
    // int target=49;
    
    // static int binarySearch(int[] arr, int target)
    // {
    //     int start=0;
    //     int end=1;
    //     int ans=0;
    //     while(start<=end)
    //     {
    //         if(arr[end]<target)
    //         {
    //             int newStart=end+1;
    //             end*=end;
    //             start=newStart;
    //         }
    //         else{
    //             int mid=start+(end-start)/2;
    //             if(arr[mid]<target)
    //             {
    //                 start=mid+1;
    //             }
    //             else if(arr[mid]>target)
    //             {
    //                 end=mid-1;
    //             }
    //             else
    //             {
    //                 return mid;
    //             }

    //             }
    //         }
    //         return -1;
    //     }
    // }

    //852. Peak index in Mountain array

//     int[] arr={0,10,5,2};
//     System.out.println(peakIndexInMountainArray(arr));


    
    
    
// }
// static int peakIndexInMountainArray(int[] arr) {
//     int start=0;
//     int end=arr.length-1;

//     while(start<end)
//     {
//         int mid=start+(end-start)/2;
//         if(arr[mid]>arr[mid+1])
//         {
//             //you are in decreasing part of array
            
//             end=mid;//because mid maybe the possible answer
//         }
//         else
//         {
//             //ascending array
//             start=mid+1;
//         }
//     }
//     //start==end would point at largest num because of two checks above
//     return end;




    //1094. Find in mountain array
    // static int findInMountainArray(int target, MountainArray mountainArr) {
    //     int start=0;
    //     int end = mountainArr.length()-1;
    //     while(start<end)
    //     {
    //         int mid=start+(end-start)/2;
    //         if(mountainArr.get(mid)>mountainArr.get(mid+1))
    //         {
    //             end=mid;

    //         }
    //     }
    // }



//     33. Search in Rotated Sorted Array

//     class Solution {
//     public int search(int[] nums, int target) {
//         int start=0;
//         int pivot=findPivot(nums);
//         int end = nums.length-1;

//         int ans=binarySearch(nums,target,start,pivot);
//         if(ans!=-1)
//         {
//             return ans;
//         }
//         else 
//         {
//             return binarySearch(nums,target,pivot+1,end);
//         }


//     }
//     public int binarySearch(int[] nums, int target,int start,int end)
//     {
//         while(start<=end)
//         {
//             int mid=start+(end-start)/2;
//             if(nums[mid]==target)
//             {
//                 return mid;
//             }
//             else if(nums[mid]>target)
//             {
//                 end=mid-1;
//             }
//             else
//             {
//                 start=mid+1;
//             }
//         }
//         return -1;
//     }

//     public int findPivot(int[] nums)
//     {
//         for(int i=0 ; i<nums.length-1 ; i++)
//         {
//             if(nums.length==1)
//             {
//                 return 0;
//             }
//             if(nums[i]>nums[i+1])
//             return i;
//         }
//         return -1;
//     }
// }

    //Matrix sorted in row and col

    int[][] matrix = {
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
    };
    int target=72;
    searchMatrix(matrix, target);
}
    static void searchMatrix(int[][]matrix,int target)
    {
        int start=0;
        int end=matrix[0].length-1;
        System.out.println(end);
        int col=end;
        for(int row=start;row<matrix.length ; row++)
        {
            while(col>=0 && row< matrix.length)
            {
                System.out.println(matrix[row][col]);
                if(matrix[row][col]==target)
                {
                    System.out.println("found at ["+row+ "]["+col);
                    return;
                }
                else if(matrix[row][col]>target)
                {
                    col--;
                }
                else
                {
                    row++;
                }
            }
            
        }
        System.out.println("Not found");
        return;
        
    }
}


