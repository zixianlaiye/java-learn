package P50;

/**
 * Created by Administrator on 2016/11/9.
 */

//对线程优先级的一些研究，输出结果可以看出优先级大的，获得的cpu时间多
public class Run {

    public static void main(String []args){
        try{

            ThreadA A=new ThreadA();
            A.setPriority(Thread.MIN_PRIORITY);
            A.start();
            ThreadA B=new ThreadA();
            B.setPriority(Thread.MAX_PRIORITY);
            B.start();

            Thread.sleep(5000);
            A.stop();
            B.stop();

            System.out.println("a="+A.getCount());
            System.out.println("b="+B.getCount());




        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
