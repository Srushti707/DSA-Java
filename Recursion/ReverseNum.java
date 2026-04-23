package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n=121;
        int rev= rev(n, 0);
        System.out.println(rev(n,0));

        if(n==rev) System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
    static int rev(int n, int sum)
    {
        if (n == 0) return sum;

        int rem = n % 10;
        sum = sum * 10 + rem;

        return rev(n / 10, sum);
    }
}
