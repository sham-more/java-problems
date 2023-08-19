/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class ReverseArray
{
	public static void main(String[] args) {
		System.out.println("++++ Reverse Array Program ++++");
		
		int [] arr ={1,2,3,4};
		
	    int [] newArr =new int[arr.length];
		
		for (int i = arr.length-1 , j=0 ; i>=0 ; i--,j++ ) {
		     newArr[j] = arr[i];
		}
		
		System.out.println("Reversed Arry:");
		
		String result = Arrays.toString(newArr);
		
		System.out.println(result);
		
		
		
	 
		
		
	}
}
