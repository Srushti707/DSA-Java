package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        // int[] arr={24,45,32,65,78,98,75,43,21};
        // int target=75;

        // for(int i=0 ; i<arr.length ; i++)
        // {
        //     if(arr[i]== target)
        //     {
        //         System.out.println("Target found at index: " +i);
        //     }
        // }


        //1295  Even Digits in an Array
        // int[] arr={24,-335,6554,-654432,654,78,8,-75};
        // int count=0;

        // for(int i=0 ; i<arr.length ; i++)
        // {
        //     int digits=0;
        //     int num=Math.abs(arr[i]);
        //     if(num==0)
        //     {
        //         digits=1;
        //     }
        //     while(num>0)
        //     {
        //          num=num/10;
        //         digits+=1;
        //     }
        //     if (digits%2==0)
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("Count of numbers with even digits: " + count);


        //1672  Richest Customer Wealth

        int[][] accounts={{1,2,3},
                          {3,2,1},
                          {4,5,6,8}};
        System.out.println(richest(accounts));
        
                        }
                    
                    
                    
                    
                    public static int richest(int[][]accounts){
                        int max=0;
                        for(int row=0 ; row<accounts.length; row++)
                            {
                                
                            int sum=0;
                            for(int col =0 ; col<accounts[row].length ; col++)
                            {
                                sum+=accounts[row][col];
                            }
                            if(sum>max)
                            {
                                max=sum;
                            }
                            
                        }
                        return max;
                    }
                }