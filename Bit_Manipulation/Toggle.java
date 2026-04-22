package Bit_Manipulation;

public class Toggle {
    public static void main(String[] args) {
        int a=9;
        int i=2;

        a=a^(1<<i);
        System.out.println(a);
    }
}
