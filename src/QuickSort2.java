/**
 * Created by Administrator on 2016/10/25.
 */
public class QuickSort2 {
    public  static void quicksort(int []a,int low,int high)
    {
        if(low<high&&a.length>0)
        {
            int i=low;
            int j=high;
            int x=a[i];


            while(i<j){
                while (i<j&&a[j]>=x)
                    j--;
                if (i < j&&a[j] < x)
                {
                    a[i] = a[j];
                    i++;
                }

                while (i < j &&a[i] < x)
                    i++;
                if (i<j&&a[i]>=x)
                {
                    a[j] = a[i];
                    j--;
                }

            }
            a[i]=x;
            quicksort(a,low,i-1);
            quicksort(a,i+1,high);


        }




    }

    public static void main(String [] args){

        int [] a=new  int[10];
        for(int i=0;i<10;i++)
            a[i]=10-i;


        quicksort(a,0,9);
        for(int j=0;j<10;j++)
        System.out.println(a[j]);






    }



}

