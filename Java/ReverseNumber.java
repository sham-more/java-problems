 

public class ReverseNumber
{
	public static void main(String[] args) {
	    
	    //remainder
	   //formula
	  // output = remainder * 10 + output;
	   //delete last num
		System.out.println("====reverse num====");
		
		int result = reversedNum();
		System.out.println(result);
	}
	
	public static int reversedNum(){
	    int n = 1234;
	    int output=0;
	    
	    while(n>0){
	        
	       int rem = n % 10;
	        
	       
	        n=n/10;
	        
	         output = output * 10 + rem;
	        
	        
	        
	    }
	    
	    return output;
	}
}
