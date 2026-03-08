public class selectionSort {

    public static void selectionsort(){
        int [] a={10,19,56,89,34,43,54};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            System.out.println(a[i]);
        }





    }
    public static void main(String[]args){
        selectionsort();

    }
}
