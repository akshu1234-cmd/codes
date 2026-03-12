import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter {

    public static void main(String[]args){
        String s="apple bananna fruit apple bananna";
        String[]s2= s.split(" ");

        HashMap<String,Integer>h=new HashMap<>();
        for(String s3:s2){
            if(h.containsKey(s3)) {
                h.put(s3, h.get(s3) + 1);
            }else{
                h.put(s3,1);

            }
        }


        for(Map.Entry<String,Integer>entry:h.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }









    }
}
