/**
 * Created by Administrator on 2016/11/4.
 */



//进行文本的读取与存储操作
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class IOTEST {
    public static void main(String [] args)
    {
        try{
            Scanner in=new Scanner(new File("D:/1.txt"));

            if(in.hasNext()) {
                String str = in.nextLine();
                splitt(str);
            }

        }

        catch(FileNotFoundException e){
            e.printStackTrace();

    }



    }

    public static String [] splitt(String str){

        String strr = str.trim();
        String[] abc = strr.split("[\\p{Space}]+");
        String str1 = abc[0];
        String str2 = abc[1];

        int i = Integer.parseInt(str1);
        int j=Integer.parseInt(str2);
        System.out.println(i);
        System.out.println(j);
        return abc;
    }


}
