package Q07;

/**
 * Created by Administrator on 2016/11/7.
 */

import java.util.Stack;//导入相关包

public class QueueWithTwoStacks {
    /**
     * 用两个栈实现一个队列，完成两个函数appendTail和deletedHead,分别是在队列尾部插入节点
     * 和在队列头部删除节点的功能
     */

    private Stack<String> stack1=new Stack<String>();
    private Stack<String> stack2=new Stack<String>();

    public void appendTail(String s)
    {
        //进队列操作
        stack1.push(s);

    }

    public String deleteHead()throws Exception{

        //利用stack2对1中的数据进行读入，这样在栈bottom的就换到栈top的位置了，此时将top的读出,就是原理
        //在这之前，对栈中是否为空等条件进行判断是很重要的
        if(stack2.isEmpty()){

            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }

        if(stack2.isEmpty())
        {
            throw new Exception("队列为空");
        }

        String a=stack2.pop();


      return a;


    }

    public static void main(String [] args){

        QueueWithTwoStacks a1= new QueueWithTwoStacks();


        try {
            a1.appendTail("2333");
            a1.appendTail("6666");
            a1.appendTail("呵呵");
            String b=a1.deleteHead();
            System.out.println(b);
            a1.appendTail("999");
            a1.appendTail("10");

             b=a1.deleteHead();
            System.out.println(b);

            b=a1.deleteHead();
            System.out.println(b);
            b=a1.deleteHead();
            System.out.println(b);
            b=a1.deleteHead();
            System.out.println(b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


}
