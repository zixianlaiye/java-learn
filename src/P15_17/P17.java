package P15_17;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * Created by Administrator on 2016/12/5.
 */
public class    P17 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result=null;
        ListNode current=null;

        //若一个为空时
        if(list1==null&&list2!=null)
        return list2;

        if(list2==null&&list1!=null)
            return list1;

        if(list1==null&&list2==null)
            return null;

        while(list1!=null&&list2!=null){

         if(list1.val<=list2.val){
             if(result==null){
                 current=result=list1;
             }
             else
             {
                 current.next=list1;
                 current=current.next;
             }
             list1=list1.next;

         }
         else
         {
             if(result ==null)
             {
                 current=result=list2;
             }

             else{
                 current.next=list2;
                 current=current.next;
             }
             list2=list2.next;
         }


        }
        if(list1==null)
            current.next=list2;
        if(list2==null)
            current.next=list1;

        return result;



    }

}
