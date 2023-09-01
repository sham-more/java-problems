 
import java.util.*;
public class commonFromTwoIntArray
{
	public static void main(String[] args) {
		System.out.println("Common from two int array");
		
		int [] arr1={1,2,3,4,0,9};
		int [] arr2={4,5,0,6,7,9};
		
		Set<Integer> duplicates= new HashSet<>();
		
		for (int i =0; i<arr1.length ;i++ ) {
		    for(int j=0;j<arr2.length;j++){
		        if(arr1[i]==arr2[j]){
		            duplicates.add(arr1[i]);
		            break;
		        }
		    }
		}
		
		//printing duplicates:
		System.out.print("duplicates are: ");
		for(int d : duplicates){
		    System.out.print(d+" ");
		}
		
		
	}
}
