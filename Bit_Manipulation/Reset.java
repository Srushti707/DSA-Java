package Bit_Manipulation;

public class Reset {
    public static void main(String[] args) {
        int a=13;
        int i=2;
        a= a&~(1<<i); //negate the 1
        System.out.println(a);
    }
}
