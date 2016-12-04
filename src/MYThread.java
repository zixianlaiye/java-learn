/**
 * Created by Administrator on 2016/10/26.
 */
public class MYThread extends Thread {

    private String name;
    private int delayTime;


    MYThread(String name,int delayTime){

        super(name);
        this.name=name;
        this.delayTime=delayTime;
    }


    public void run(){
        while(true) {
            System.out.println("thread" + name);


            try {
                Thread.sleep(delayTime);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }


    public static void main(String [] args){

        MYThread thread1=new MYThread("t1",1000);
        MYThread thread2=new MYThread("t2",2000);
        thread1.start();
        thread2.start();

    }
}
