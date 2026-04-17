package DSA.Maths;

public class Seive {
    public static void main(String[] args) {
    int n=40;
    boolean[] primes= new boolean[n+1];

    //normally array is false
    //so false=prime
    for(int i=2; i*i<n; i++)
    {
        if(!primes[i])
        {
            for(int j= i*i; j<n; j+=i)
            {
                primes[j]=true;
            }
        }
    }
    for(int i=2; i<n; i++)
    {
        if(!primes[i]) System.out.print(i+" ");
    }
    }

}
