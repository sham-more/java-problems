
public class ReverseString
{
	public static void main(String[] args) {
	    //string length
	   //new string for result
	   //chat at i 
	   
	    
		System.out.println("Reverse String Program");
	    String Result = reversedString();
	    System.out.println(Result);
	    
	}
	
	public static String reversedString(){
	    String str = "Learn Code";
	    int strLength=str.length();
	    String newStr="";
	    char ch ;
	    
	    
	    for(int i =0;i < strLength ; i++){
	        ch = str.charAt(i);
	        newStr =  ch+newStr;
	    }
	    
	    
	    return newStr;
	    
	    
	    
	}
	
	
	
}
