/**
 * Created by Administrator on 2016/10/17.
 */

//测试
import java.util.*;
public class testlist {

    public static void main(String [] args)
    {
        List<String> staff=new LinkedList<>();
        staff.add("Tom");
        staff.add("Jerry");
        staff.add("Herry");
        Iterator<String> iter =staff.iterator();
        while(iter.hasNext())
        {
            String element=iter.next();
            System.out.println(element);
        }

        staff.remove(2);
       for(String element:staff)
       {
           System.out.println(element);
       }




    }
}
