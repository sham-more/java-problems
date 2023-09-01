 

public class EvenOddSum
{
	public static void main(String[] args) {
		int n = 6;
		int ans =0;
		
		for(int i=0;i<=n;i++){
		    if(i%2==0){
		        ans = ans-i;
		    }
		    else{
		        ans=ans+i;
		    }
		}
		
		System.out.println(ans);
	}
}
