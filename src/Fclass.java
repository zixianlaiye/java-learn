/**
 * Created by Administrator on 2016/10/13.
 */
public class Fclass<T> {
    public T obj;
    public Fclass(T obj){
        this.obj=obj;
    }

    public void showType(){
        System.out.println("T的实际类型是:"+obj.getClass());

    }

    public void print(){

        System.out.println("Fclass");
    }

    public static void main(String [] args){

        A a=new A(4,5);
        Fclass f1=new Fclass<A>(a);
        f1.showType();
        f1.print();


    }




}

class A{

    int x,y;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }

    int sum(){
        return x+y;
    }
    }


class B{

    public void print(){
        System.out.println("/B的输出");
    }
}


