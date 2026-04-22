package Arrays;
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=0, b=1,c=0;
        System.out.print("Fibonacci series:" + a + " " + b+"");
        while(c<=n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" " + c );
        }

    }
}