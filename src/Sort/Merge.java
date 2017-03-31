package Sort;

/**
 * 二路归并算法的核心，将两个数组合并成一个
 * Created by Administrator on 2016/11/28.
 */
public class Merge {
    static  int   TR2[]=new int [100];

    public static void merge(int []a,int[]b,int i,int j,int n)
    {
        //a为待排序数组，左边为i-j,右边为j+1-n
        //数组b为新排好序列的数组，做仓库作用

        //其中i为a数组起始地址，j为地址中点，n为终止地址


            int k=i,m=j+1;
            for(;i<=j&&m<=n;k++){

                if(a[i]<a[m]){
                    b[k]=a[i++];
                }
                else {
                    b[k] = a[m++];
                }
            }

            if(i<=j){
                for(;i<=j;i++){
                    b[k++]=a[i];
                }
                if(m<=n){
                    for(;m<=n;m++){
                        b[k++]=a[m];
                    }
                }

            }

        }

        public static void MergeSort(int []SR,int []TR1,int s,int t)
        {


            int m;
            //若首尾相同，则将这个元素放入TR1中
            if(s==t)
                TR1[s]=SR[s];
            else
            {
                m=(s+t)/2;  //将数组分为
                MergeSort(SR,TR2,s,m);
                MergeSort(SR,TR2,m+1,t);
                merge(TR2,TR1,s,m,t);//将TR2中的两部分进行归并，存储在TR1中
            }

        }

    public static void main(String [] args) {
        int []a={1,5,4,3,9,45,64,32,31,12,33};
        int []b=new int[11];


        MergeSort(a,b,0,a.length-1);
        for (int c:b
             ) {
            System.out.println(c);

        }


    }


    }


          //测试用例
//        public static void main(String [] args){
//            int [] a={1,3,7,2,2,5};
//            int []b=new int[6];
//            merge(a,b,0,2,5);
//            for ( int  c: b
//                 ) {
//                System.out.println(c);
//
//            }
//
//
//        }







