package Q07;

/**
 * Created by Administrator on 2016/11/7.
 */
import java.util.LinkedList;


public class StackWithTwoQuenes {

    //利用两个LinkedList链表模拟队列的先进先出
    private LinkedList<String> queue1=new LinkedList<>() ;
    private LinkedList<String> queue2=new LinkedList<>() ;


    //队列中数据出来
    public String pop(){


        String re =null;

        if(queue1.size()==0&&queue2.size()==0)
        {
            return null;
        }

        if(queue2.size()==0){

            while(queue1.size()>0){
                System.out.println(queue1.size());
                re=queue1.removeFirst();
                System.out.println(queue1.size());
//                if(queue1.size() != 0)
                queue2.addLast(re);
            }
        }
        else if(queue1.size()==0){
            while(queue2.size()>0){
                System.out.println(queue2.size());
                re=queue2.removeFirst();
                System.out.println(queue2.size());
//                if(queue2.size() != 0)
                queue1.addLast(re);

            }
        }
        return re;


    }

    public void  push(String a){
        if(queue1.size()==0&&queue2.size()==0)
        {
            queue1.addLast(a);
        }

        else if(queue1.size()>0&&queue2.size()==0){
            queue1.addLast(a);

        }
        else if(queue2.size()>0&&queue1.size()==0){
            queue2.addLast(a);
        }

    }


    public static void main(String [] args){
        StackWithTwoQuenes a=new StackWithTwoQuenes();

        String b;
        a.push("a");

        a.push("b");

        a.push("c");
        a.push("d");
        b=a.pop();
        System.out.println(b);
        b=a.pop();
        System.out.println(b);
        b=a.pop();
        System.out.println(b);

    }

}
