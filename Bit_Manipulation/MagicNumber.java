package DSA.Bit_Manipulation;

public class MagicNumber {
    public static void main(String[] args) {
        int num=6;
        int base=5;
        System.out.println(magicNum(num,base));

    }
    static int magicNum(int num,int base)
    {
        int sum=0;
        int count=0;
        while(num>0)
        {
            if((num&1)==1) sum+=(base*count);
            num=num>>1;
            count++;
        }
        return sum;
    } 
}
