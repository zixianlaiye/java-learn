package Algo;

/**
 *
 * 在有序的数组中找出和为K的两个数，没有则返回flase
 * Created by Administrator on 2016/11/27.
 */
public class FindTwoSum {
    public static boolean check(int []a,int m,int n,int sum) {
        if (a == null || a.length < 2)
            return false;

        int low = 0;
        int high = a.length - 1;

        while (low < high) {

            if (a[low] + a[high] == sum) {
                m = low;
                n = high;

                System.out.println ("m="+m+"n="+n);
                return true;

            }
            if (a[low] + a[high] < sum) {
                low++;
            }
            if (a[low] + a[high] > sum) {
                high--;
            }

        }
        return false;
    }


        public static void main(String [] args){
            int [] a=new int [10];
            for(int i=0;i<10;i++){
                a[i]=i;
            }

          int m=0,n=0;

           if(check(a,m,n,15))
           {
               System.out.println ("m="+m+"n="+n);
           }


    }

         




}
