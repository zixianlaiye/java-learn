package MYThread;

/**
 * Created by Administrator on 2016/11/4.
 */

import java.util.concurrent.atomic.*;
class MYThread extends Thread{
    private static Object object = new Object();

    private static int Ticket_counts=5;
    private String name;

    public int  get(){
        return Ticket_counts;
    }

    public void set(int a)
    {Ticket_counts=a;

    }


    public MYThread(String name)
    {
        this.name=name;
    }





    @Override
    public  void run()  {
        synchronized (object) {
            while (Ticket_counts > 0) {

                System.out.println(Thread.currentThread().getName() + "卖了一张票:剩余票数" + --Ticket_counts);
                set(Ticket_counts);
            }
        }
        }





}


public class Ticket {
    public static void main(String [] args){
        MYThread a1=new MYThread("A1");
        MYThread a2=new MYThread("A2");
        MYThread a3=new MYThread("A3");
        a1.start();
        a2.start();
        a3.start();
    }

}