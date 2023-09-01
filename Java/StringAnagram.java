/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class StringAnagram
{
	public static void main(String[] args) {
		System.out.println("++++Program to check whether strings are anagram or not++++");
		
		//logic:
		//toLowerCase()
		
		//length check;
		
		//convert toCharArray;
		//sort charArrays;
		
		//check eqality of two array;
		//if yes?"anagram":"not anagram";
		
		
		String str1="keep";
		String str2="peek";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length() ==str2.length()){
		    char [] charArray1 = str1.toCharArray();
		    char [] charArray2 = str2.toCharArray();
		    
		    Arrays.sort(charArray1);
		    Arrays.sort(charArray2);
		    
		    boolean result = Arrays.equals(charArray1,charArray2);
		    
		    if(result){
		        System.out.println("anagram");
		    }
		    else{
		        System.out.println("not anagram");
		    }
		}
		
		else{
		   System.out.println("not anagram");
		}
	}
}
