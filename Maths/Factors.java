package Maths;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        int n= 40;
        factors2(n);
    }
    static void factors1(int n)
    {
        for(int i=1; i<n; i++)
        {
            if(n%i==0) System.out.print(i+" ");
        }
    }

    //running till sqrt because the numbers get repeated
    static void factors2(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i*i<=n; i++)
        {
            if(n%i==0) 
                {
                    if(i*i==n) System.out.print(i+" ");
                    else 
                        {
                            System.out.print(i+" ");
                            list.add(n/i); //divide with the num to get the other factor
                        }
                }
        }
        for(int i=list.size()-1; i>=0; i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }

    //
}
