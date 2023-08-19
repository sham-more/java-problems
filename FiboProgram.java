 

public class FiboProgram
{
	public static void main(String[] args) {
		System.out.println("Fibonachi Series program ::");
		
	 
		
		
		int n = 5;
	    int a=0;
		int b=1;
		int temp;
		
		for (int i =1; i<=n; i++ ) {
	
		    System.out.print(  a+ ",");
		    temp = a+b;
		    a=b;
		    b=temp;
		}
		
		
		
		
		
	}
}
