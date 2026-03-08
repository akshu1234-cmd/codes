public class bubbleSort {

    private static void bubblesort() {
        int[]a={4,5,6,2,1,7,10,3,8,9};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);  // ✅ prints fully sorted array
        }



    }
    public static void main(String[]args){
        bubblesort();
    }


}
