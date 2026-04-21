package DSA.Recursion;

public class PrintNnum {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n)
    {
        if(n==0)
        {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
