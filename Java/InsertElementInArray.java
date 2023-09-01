import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
         int n = s.nextInt();

         int [] arr = new int [n];
         int [] arr2 = new int [n+1];

        System.out.println("Enter numbers:");

         for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
         }
        
         System.out.println("Enter index where value to be inserted:");

         int m = s.nextInt();
        
         System.out.println("Enter new num to be inserted:");

         int p = s.nextInt();

         for (int i = 0; i <n+1; i++) {
            if(i<m){
                arr2[i] = arr[i];
            }
            else if (i==m){
                arr2[i] = p;
            }
            else{
                arr2[i] = arr[i-1];
            }
         }
        System.out.println("new array : ");
         for(int i =0;i<n;i++){
            System.out.println(arr2[i]);
         }

         

         



        
    }
}
