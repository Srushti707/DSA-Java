package DSA.Bit_Manipulation;

public class LastSetBit {
    public static void main(String[] args) {
        //when we minus 1 from number all the bits after the last set bits turn 1
        int a=84;
        System.out.println(Integer.toBinaryString(a));
        a= a&(a-1);
        System.out.println(Integer.toBinaryString(a));
    }
}
