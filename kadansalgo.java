public class kadansalgo {

    public static int kd(){
        int []a={2, 3, -8, 7, -1, 2, 3};
        int crr=a[0];
        for(int i=0;i<a.length;i++){
            int max=0;
            for(int j=i;j<a.length;j++){
                max+=a[j];
                crr=Math.max(crr,max);
            }

        }
        return crr;


    }

            public static void main(String[]args){

                System.out.println(kd());
    }


}
