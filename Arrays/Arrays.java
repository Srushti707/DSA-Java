package DSA.Arrays;
// import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //2D array
        int[][] arr = new int[3][3];
        int max=0;
        // Scanner sc = new Scanner(System.in);

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         arr[row][col] = sc.nextInt();
        //     }
        // }
        // print the 2D array
        // for(int row=0;row<arr.length; row++)
        // {
        // for(int col=0 ; col<arr[row].length ; col++)
        // {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // enhanced array
        // for (int[] a : arr) {
        //     System.out.println(java.util.Arrays.toString(a));
        // }
        int[] arr2={1,2,3,4,5,6,7,8,9,888};

        for(int i=1 ; i< arr2.length ; i++)
        {
            max=arr2[0];
            if( arr2[i]>max)
                {
                    max=arr2[i];
                }
            
        }
        System.out.println("Max value is: " + max);



    }
}