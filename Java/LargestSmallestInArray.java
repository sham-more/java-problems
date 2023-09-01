 

public class LargestSmallestInArray
{
	public static void main(String[] args) {
	    int [] arr ={1,2,3,4,5,6};
	    
	    int Largest = arr[0];
	    int Smallest = arr[0];
	    
	    
	    for (int i =0;i<arr.length ;i++ ){
	        if(arr[i]>Largest){
	            Largest=arr[i];
	        }
	        else if(Smallest<arr[i]){
	            Smallest = arr[i];
	        }
	    }
	    
	    System.out.println("Largest : " + Largest);
	    System.out.println("Smallest : " +Smallest);

	    
	    
 	}
}
