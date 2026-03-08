import java.util.Objects;

public class StringAnagram {
    String s="earth";
    String s1="heart";
    String s2="";

    public  void StringAnagram(){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    s2+=s.charAt(i);

                }
            }


        }
        System.out.println(s2);
        if(Objects.equals(s2, s)){
            System.out.print("its anagram");
        }
        else{
            System.out.println("its not anagram");
        }
    }






    public static void main(String[]args){
        StringAnagram a=new StringAnagram();

       a.StringAnagram();

    }
}
