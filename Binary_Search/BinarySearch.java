package Binary_Search;

public class BinarySearch {
        public static void main(String[] args) {
            int[] arr={2,4,5,6,8,9,10};
            int target=1;
            // System.out.println(Binary(arr,target));
            System.out.println(Ceiling(arr,target));

        }

        static int Binary(int[]arr ,int target)
        {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid])
                    {
                        return mid;
                    }
                    else if(target>arr[mid])
                        {
                            start=mid+1;
                        }
                    else
                    {
                        end=mid-1;

                    }
            }
            return -1;
        }


        //Ceiling
        static int Ceiling(int[]arr ,int target)
        {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid])
                    {
                        return mid;
                    }
                    else if(target>arr[mid])
                        {
                            start=mid+1;
                        }
                    else
                    {
                        end=mid-1;

                    }
            }
            return arr[start];
        }

        //Floor

        static int Floor(int[]arr ,int target)
        {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid])
                    {
                        return mid;
                    }
                    else if(target>arr[mid])
                        {
                            start=mid+1;
                        }
                    else
                    {
                        end=mid-1;

                    }
            }
            return arr[end];
        }


    }
