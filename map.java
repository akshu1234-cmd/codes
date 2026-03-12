import java.util.*;

public class map {




    public static void main(String[]args){
        //set
       TreeMap<Integer, Integer> h=new TreeMap<Integer, Integer>();
        h.put(1,91);
        h.put(5,43);
        h.put(3,60);
        h.put(4,50);


        for(int key:h.keySet()){
            System.out.println(key);
        }
        for(int val:h.values()){
            System.out.println(val);
        }








    }
}
