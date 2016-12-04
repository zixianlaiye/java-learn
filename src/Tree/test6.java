package Tree;

/**
 * Created by Administrator on 2016/11/16.
 */


//构建二叉树，根据前序和中序的顺序。还可以打印后序
public class test6 {
    public  BinaryTree Construct(int []pre,int[]in){

        if(pre==null||in==null)
            return null;

        if(pre.length<=0||pre.length!=in.length)
            return null;

        BinaryTree root=ConstructCore(pre,0,pre.length-1,in,0,in.length-1);
        return root;


    }

    private BinaryTree ConstructCore(int []pre,int startPre,int endPre,int[]in,int startIn,int endIn){

           if(startPre>endPre||startIn>endIn)
               return null;

        BinaryTree root=new BinaryTree(pre[startPre]);



        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=ConstructCore(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=ConstructCore(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }

        return root;


    }

    public static void main(String [] args){

        int []pre={1,2,4,7,3,5,6,8};
        int []in={4,7,2,1,5,3,6,8};
        test6 a=new test6();

        BinaryTree root=a.Construct(pre,in);
        root.preOrder(root);
        System.out.println("");
        root.laOrder(root);
    }



}
