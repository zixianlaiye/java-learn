/**
 * Created by Administrator on 2016/10/31.
 */

import java.io.*;


public class MYSynchronized {
 private int j;

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc"+j);

    }

    private synchronized  void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec"+j);
    }

    class Inc implements Runnable{

        public void run(){
            inc();

        }
    }


    class Dec implements Runnable{
        public void run() {

            dec();
        }

    }

    public static void main(String [] args)
    {
        MYSynchronized tt=new MYSynchronized();
        Inc inc=tt.new Inc();
        Dec dec=tt.new Dec();

        for(int i=0;i<2;i++)
        {
            Thread t=new Thread(inc);
            t.start();
            t=new Thread(dec);
            t.start();
        }
    }


}
