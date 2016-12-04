/**
 * Created by Administrator on 2016/10/26.
 */

//JAVA实现链表

    class Node{

    Object data;
    Node next;

    public  Node(Object a){
        this.data=a;
        this.next=null;
    }
    public Node(){
        this.next=null;
    }
}

public class MYList {

    Node head;
    public MYList(){
        //构造函数初始化Node
        head =new Node();
    }


    public void ShowList(){
        Node p=head.next;
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }

    }

    public void ShowReverse(Node p)
    {
        if(p!=null){
            if(p.next!=null)
            {
                ShowReverse(p.next);
            }
            System.out.print(p.data);

        }

    }


    public void insert(Object a){
        Node s=new Node(a);

        //头插法

//         s.next=head.next;
//         head.next=s;

        //尾插法

        Node p=head;

        while(p.next!=null)
        {
            p=p.next;

        }

        p.next=s;



    }

    public static void main(String [] args){
        MYList list=new MYList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.ShowList();

        list.ShowReverse(list.head.next);


    }



}
