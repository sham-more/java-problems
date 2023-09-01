/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class commonFromTwoArray
{
	public static void main(String[] args) {
		String [] arr1 ={"sham","gopinath","more"};
		String [] arr2 ={"my","name","sham","more"};
		Set<String> set = new HashSet<>();
		
		for (int i =0; i<arr1.length ;i++ ) {
		    for(int j =0;j<arr2.length;j++){
		        if (arr1[i]==arr2[j]) {
		            set.add(arr1[i]);
		            
		        }
		    }
		}
		
		for(String i : set){
		    System.out.print(i +" ");
		}
		
		

	}
}
