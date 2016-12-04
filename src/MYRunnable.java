/**
 * Created by Administrator on 2016/10/27.
 */
public class MYRunnable implements Runnable{
    private String name;
    private int delaytime;
    MYRunnable(String name,int delaytime){
        this.name=name;
        this.delaytime=delaytime;

    }

    public void run(){
        while(true){

            System.out.println("线程"+name);
            try{
                Thread.sleep(delaytime);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
    }


    public static void main(String [] args){
        MYRunnable a1=new MYRunnable("a1",1000);
        MYRunnable b1=new MYRunnable("b1",2000);

        Thread c1=new Thread(a1);
        Thread c2=new Thread(b1);
        c1.start();
        c2.start();



    }

}
