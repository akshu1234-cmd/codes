import java.util.Scanner;

public class ThreadOddeven extends Thread {

//    @Override
//    public void run(){
//        for(int i=1;i<=5;i++) {
//            System.out.println(i);
//
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }


    public void evennumber(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //System.out.println("enter the number");
        if(a%2==0){
            System.out.println("even");
        }

        }

        public void oddnumber(){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(b%2!=0){
            System.out.println("odd number");
        }

    }




    public static void main(String[]args){
        ThreadOddeven t=new ThreadOddeven();
        ThreadOddeven t1=new ThreadOddeven();
        System.out.println("enter the number");
        t.start();
        t1.start();
        t.evennumber();
        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("enter the number");
        t1.oddnumber();




    }
}
