package Tree;

/**
 * Created by Administrator on 2016/11/14.
 */




public class BinaryTree {



    private Object data;
    BinaryTree left;
    BinaryTree right;




    public BinaryTree(Object data){
        this.data=data;
        left=right=null;
    }

    public BinaryTree(Object data,BinaryTree left,BinaryTree right){

        this.data=data;
        this.left=left;
        this.right=right;
    }

    public String toString(){
        return data.toString();
    }

    public  void preOrder(BinaryTree parent){

        if(parent ==null)
            return ;
        System.out.print(parent.data+" ");
        preOrder(parent.left);
        preOrder(parent.right);

    }

    public void inOrder(BinaryTree parent){
        if(parent==null)
            return ;
        inOrder(parent.left);
        System.out.print(parent.data+" ");
        inOrder(parent.right);

    }
    public void laOrder(BinaryTree parent){
        if(parent==null)
            return ;
        inOrder(parent.left);

        inOrder(parent.right);
        System.out.print(parent.data+" ");

    }




    public static void main(String[] args){
        BinaryTree b=new BinaryTree("B");
        BinaryTree c=new BinaryTree("c");
        BinaryTree tree =new BinaryTree("A",b,c);


        System.out.println("前序遍历二叉树结果: ");
        tree.preOrder(tree);


        System.out.println("中序遍历二叉树结果: ");
        tree.inOrder(tree);
    }




}
