/**
 * Created by Administrator on 2016/11/12.
 */

//验证类加载顺序
public class TestClass {


    private static String msg(String msg){

        System.out.println(msg);
        return msg;

    }


    static String a=msg("1");
    {
        a=msg("3");
    }

static
     {
        a=msg("6");
    }



    public static void main(String []args){

        TestClass a=new TestClass();

    }
}
