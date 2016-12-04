import java.util.IdentityHashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/9/22.
 */
//利用泛型，控制输入实现任意长度数组的快速排序

import java.util.*;
public class QuickSort {

    public static void main(String [] args)
    {

        QuickSort a=new QuickSort();
//       a.items=new ArrayList<>();
//        a.items.add(24);
//        a.items.add(23);
//        a.items.add(27);
//        a.items.add(22);
//        a.items.add(20);
//        a.items.add(26);
//        a.items=a.sort(a.items);
        List<Integer> items= new ArrayList<>();
//        items.add(20);
//        items.add(23);
//        items.add(22);
//        items.add(28);
//        items.add(24);\
        items=a.GetNumbers();
        items=a.sort(items);
        System.out.print(items);



//        items=a.sort(items);
//        for(Integer i:items)
//            System.out.print(items.get(i)+"  ");


    }
    public List<Integer> GetNumbers()
    {
        Scanner in=new Scanner(System.in);
        List<Integer> items=new ArrayList<>();
        int temp;
        while(true)
        {
            System.out.println("请输入数字，停止则输入-1");
            temp=in.nextInt();
            if(temp==-1)
            {
                System.out.println("排序为ֹ");
                break;
            }
            else items.add(temp);

        }
        return items;
    }

    public List<Integer>  sort(List<Integer> items)
    {
        if(items.size()>1)
        {
            List<Integer> smaller=new ArrayList<>();
            List<Integer>same=new ArrayList<>();
            List<Integer> larger =new ArrayList<>();

            Integer chosen =items.get(items.size()/2);
            for(Integer i: items)
            {
                if(i<chosen)
                    smaller.add(i);
                else if(i>chosen)
                    larger.add(i);
                else
                    same.add(i);
            }
            sort(smaller);
            sort(larger);

           //最后的合并工作
            items.clear();
            items.addAll(smaller);
            items.addAll(same);
            items.addAll(larger);
        }
        return items;
    }

}
