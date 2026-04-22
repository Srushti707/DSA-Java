package Bit_Manipulation;

public class Swap {
    public static void main(String[] args) {
        int a=4;
        int b=9;

        a=a^b;
        b=a^b; //its like (a^b)^b which is a
        a=a^b; //(a^b)^(a)
        System.out.println(a+" "+b);
    }
}
