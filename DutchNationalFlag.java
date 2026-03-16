import java.util.Arrays;

public class DutchNationalFlag {

    private void flag() {
        int[]a={0, 1, 2, 0, 1, 2};

        Arrays.sort(a);
        for(int i:a){
            System.out.print(i);
        }
    }

    public static void main(String[]args){
        DutchNationalFlag d=new DutchNationalFlag();
        d.flag();

    }


}
