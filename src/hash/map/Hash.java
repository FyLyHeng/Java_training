package hash.map;

import java.util.HashMap;

public class Hash {
    HashMap<String,String> area=new HashMap<String,String>();
    public void input(String century,String city){
        area.put(century,city);
    }
    public void output(){
        System.out.println(area);
    }
    public void remove(String century){
        area.remove(century);
    }
    public void outKey(){
        System.out.println(area.keySet());
    }
    public void outValue(){
        System.out.println(area.values());
    }
}
