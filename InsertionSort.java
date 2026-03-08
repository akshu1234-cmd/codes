public class InsertionSort {
    private static void insertionSort() {
        int[]a={4,5,6,2,1,7,10,3,8,9};

        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }

            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }







    public static void main(String[]args){
        insertionSort();
    }


}
