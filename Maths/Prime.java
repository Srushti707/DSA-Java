package DSA.Maths;

public class Prime {
    public static void main(String[] args) {
        int n=25;
        System.out.println(isPrime(n));
        

    }
    static boolean isPrime(int n)
    {
        for(int i=2; i<n/2; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}
