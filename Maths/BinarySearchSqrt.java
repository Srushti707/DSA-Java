package DSA.Maths;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(squareRoot(n, p));

    }
    static double squareRoot(int n,int p)
    {
        int start=0;
        int end=n;
        double root=0;
        while(start<end)
            {
            int mid=start+(end-start)/2;
            int square=mid*mid;
            if(square==n) return mid;
            else if(square>n) end= mid-1;
            else{
                root=mid;
                start=mid+1;
                }
            }   
        double inc=0.1;
        for(int i=0; i<p; i++)
        {
            while(root*root<=n)
            {
                root+=inc;
            }
            root-=inc;
            inc=inc/10;
        }
        return root;


    }
}
