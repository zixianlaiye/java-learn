/**
 * Created by Administrator on 2016/10/30.
 */

import java.util.HashMap;

public class TestHashMap {
public static void main(String [] args)
{

    HashMap map= new HashMap();
    map.put("a1",1);
    map.put("a2",2);
    map.put("a3",3);
    map.put("a4",4);
    System.out.println("keyset="+map.keySet());
    System.out.println("keyset="+map.values());

    System.out.println("keyset=a1"+map.get("a1"));

}

}
