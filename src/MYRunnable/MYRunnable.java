package MYRunnable;

/**
 * Created by Administrator on 2016/11/4.
 */
public class MYRunnable {

    public static  void main(String [] args){
        Ticket t1=new Ticket();
        Thread A1=new Thread(t1,"A1");
        Thread A2=new Thread(t1,"A2");
        Thread A3=new Thread(t1,"A3");
        A1.start();
        A2.start();
        A3.start();

    }
}


class Ticket implements Runnable{

    private int  Numbers=10;

    private int getNumbers(){
        return Numbers;
    }


    public void SellTicket(){
        this.Numbers--;

    }


    @Override
   public  void run(){

       while(getNumbers()>0) {
           synchronized (this) {
               if (getNumbers() > 0) {
                   SellTicket();
                   System.out.println(Thread.currentThread().getName() + "卖了一张票:剩余票数" + getNumbers());

               }
           }
       }

        }

    }

