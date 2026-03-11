import java.util.ArrayList;

public class List {
    //student grade tracker
    //ArrayList l=new ArrayList();//duplicate,null,index,sorting order maintanied
    String StudentName="Rahul";
    String StudentGrade="A";


    public static void main(String[]args){
        List l2=new List();
        ArrayList <Integer> l=new ArrayList <Integer> ();//duplicate,null,index,sorting order maintanied
        //out of 30 marks
        String[] subject={"maths","science","english","history"};
        for(int i=0;i<subject.length;i++){
            System.out.println(subject[i]);
        }
        l.add(23);
        l.add(23);
        l.add(25);
        l.add(27);


        for(int i:l){
            System.out.println(i);
        }
        System.out.println("name is ="+l2.StudentName +" grade is ="+l2.StudentGrade);


    }
}
