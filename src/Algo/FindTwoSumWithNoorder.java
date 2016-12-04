package Algo;


import java.util.Arrays;

/**
 *
 * 若数组为乱序，,通过设定一个布尔型的数组，对整个int 数组进行遍历，空间复杂度为O(n)
 * Created by Administrator on 2016/11/27.
 */
public class FindTwoSumWithNoorder {

    public static boolean check(int []a,boolean []b,int m,int n,int sum) {

        if (a == null || a.length < 2)
            return false;


        for (int i = 0; i < a.length; i++) {
            if (a[i] > sum)
                break;
            if (b[a[i]] == false) {
                b[sum - a[i]] = true;
            } else {
                m = a[i];
                n = sum - a[i];
                System.out.println("m=" + m + "n=" + n);
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args){
        int [] a={6,7,5,4,3,9,10};

        int sum=15;
        boolean [] b=new boolean[sum];
        //给array数组全部赋值为false
        Arrays.fill(b,false);

        int m=0,n=0;

        if(check(a,b,m,n,15))
        {
            System.out.println ("m="+m+"n="+n);
        }





    }

}
