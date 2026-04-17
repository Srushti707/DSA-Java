package DSA.Arrays;
public class CountNums {
    public static void main(String[] args) {
        // int num= 1233343873;
        // int count=0;
        
        // while(num>0)
        // {
        //     int digit= num%10;
        //     if(digit==3)
        //     {
        //         count++; 
        //     }
        //     num=num/10;
        // }
        // System.out.println("Count of digit 3: " + count);


        //reverse the number

        int num = 1234567;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev= rev*10 + digit;
            num=num/10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}