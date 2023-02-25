//entering two number and checking the greatest one

import java.util.Scanner;
class Input
{
	
	public static void main ( String args [])
	     {
	     	    Scanner obj=  new Scanner( System.in);
	     	    System.out.println("Enter any two number");
	     	    long x= obj.nextLong( );
	     	    long y= obj.nextLong( );
	     	    
    if(x>y)	    
	    System.out.println("First number is greater");	   
    else if(y>x)
	    System.out.println("Second number is greater");
    else
	    System.out.println("Both numbers are equal");
	     }
}
	     	    