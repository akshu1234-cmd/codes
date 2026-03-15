import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void str(){
        List <Integer> L =new ArrayList<Integer>();
        L.add(5);
        L.add(8);
        L.add(99);
        L.add(87);

        for(Integer i: L){
            System.out.println(i);
        }
        List<Integer> filtered=L.stream()
                .filter(n->n>10)
                .collect(Collectors.toList());
        System.out.println(filtered);

        List<Integer>Sort=L.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(Sort);



    }

    public static void main(String[]args){
        Streams s=new Streams();
        s.str();


    }
}
