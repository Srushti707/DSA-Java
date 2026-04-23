package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n=121;
        rev(n);
        System.out.println(sum);
        if(n==sum) System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
    static int sum=0;
    static int rev(int n)
    {
        if(n==0) return 0;
        int num=n%10;
        sum=sum*10 +num;
        return rev(n/10) ;
    }
}
