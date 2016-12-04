package P50;

/**
 * Created by Administrator on 2016/11/9.
 */



public class ThreadA extends Thread{


    private int count=0;

    public int getCount(){
        return count;
    }

    @Override
    public void run(){
        while(true){
            count++;
        }
    }
}

