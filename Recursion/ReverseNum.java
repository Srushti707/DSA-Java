package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n=123;
        rev(n);
        System.out.println(sum);
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
