public class lambadaExpression  {
    public static void main(String[] args) {
        //Mylambada mylambada = () -> System.out.println("hello");
        Mylambada addfunction =(int a,int b)->System.out.println(a+b);


        addfunction.add(900,800);

    }


}
    interface Mylambada{
         void add(int a, int b);

    }

