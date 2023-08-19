
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Fizz Buzz Program : ");

    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();

    for (int i = 1; i <= n; i++)
      {


	if (i % 3 == 0 && i % 5 == 0)
	  {
	    System.out.print ("Fizz");
	  }
	else if (i % 3 == 0)
	  {
	    System.out.print ("Buzz");
	  }
	else if (i % 5 == 0)
	  {
	    System.out.print ("Fizz");
	  }
	else
	  {
	    System.out.print (i);
	  }

	System.out.print ("," + " ");




      }


  }
}
