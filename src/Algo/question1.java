package Algo;

/**
 * Created by dongdong on 17-3-25.
 */
public class question1 {

    public static void main(String [] args)
    {
        int n=2;
        int tx[]={-2,-2};
        int ty[]={0,-2};
        int gx=-4;
        int gy=-2;
        int walkTime=15;
        int taxiTime=3;

        int a=check(n,tx,ty,gx,gy,walkTime,taxiTime);
        System.out.println(a);

    }


    public static int check(int n,int tx[],int ty[],int gx,int gy,int walkTime,int taxiTime)
    {

        int Walk=checkWalk(gx,gy,walkTime);
        int Taxi=checkTaxi(n,tx,ty,gx,gy,walkTime,taxiTime);
        return (Walk>Taxi)?Taxi:Walk;


    }

    public static int checkWalk(int gx,int gy,int walkTime)
    {
        if(gx<0)
            gx=-gx;
        if(gy<0)
            gy=-gy;

        return (gx+gy)*walkTime;

    }


    public static int checkTaxi(int n,int tx[],int ty[],int gx,int gy,int walkTime,int taxiTime)
    {
        int a[] =new int[n];

        int x[]=new int [n];
        int y[]=new int [n];



        for(int i=0;i<n;i++)
        {
            if(tx[i]<0)
                x[i]=-tx[i];
            else
                x[i]=tx[i];
            if(ty[i]<0)
                y[i]=-ty[i];
            else
                y[i]=ty[i];
        }

        for(int i=0;i<n;i++)
        {
            if((tx[i]-gx)<0)
            {    tx[i]=-tx[i]+gx;}
            else
                tx[i]=tx[i]-gx;

            if((ty[i]-gy)<0)
            {
                ty[i]=-ty[i]+gy;
            }
            else
                ty[i]=ty[i]-gy;

        }

        for(int i=0;i<n;i++)
        {
            a[i]=(tx[i]+ty[i])*taxiTime+(x[i]+y[i])*walkTime;

        }
        int min=a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }

        }

        return min;

    }
}
