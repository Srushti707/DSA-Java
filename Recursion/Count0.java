package Recursion;

public class Count0 {
    public static void main(String[] args) {
        int n=1030;
        System.out.println(count(n, 0));
    }
    static int count(int n, int c)
    {
        if(n==0) return c;
        int num= n%10;
        if(num==0) return count(n/10,c+1);
        else return count(n/10,c);
    }
}
