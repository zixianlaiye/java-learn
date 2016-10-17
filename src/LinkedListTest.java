/**
 * Created by Administrator on 2016/10/17.
 */

//LinkedList测试
    import java.util.*;
public class LinkedListTest {
    public static void main(String [] args){
        List<String> a= new LinkedList<>();
        a.add("AMy1");
        a.add("AMy2");
        a.add("AMy3");

        List<String> b=new LinkedList<>();
        b.add("Bob1");
        b.add("Bob2");
        b.add("Bob3");
        b.add("Bob4");


        ListIterator<String> aIter=a.listIterator();
        Iterator<String> bIter =b.iterator();


        while(bIter.hasNext()){
            if(aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());



        }
        System.out.println(a);


        //remove every second word from b
        bIter=b.iterator();//重新迭代，从头开始

        while(bIter.hasNext())
        {
            bIter.next();
            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }


        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);






    }


}
