//Program of matrix of 2x2 oder     

class  MatrixAdd
{
	public static void main( String args[ ] ) //matrix
	{
        int  i, j;                 //Declaration of variable
		int  x[ ][ ] = new int[3][3];
		
		int  a[ ][ ] = {  
					                    {1, 2},                      //1st matrix
				 	                   {1,1},
				 	          };
		int  b[ ][ ] = {  
					                   {1,1},                        //2nd matrix
				 	                  {1,1},
				 	         };
	for( i=0 ; i<2 ; i++ )                          //loop of 1st matrix
		{
			for( j=0 ; j<2 ; j++ )                       //loop of 2nd matrix
			{
				x[ i ][ j ] = a[ i ][ j ] + b[ i ][ j ];       //Additon of two matrix
			}
		}
        
		for( i=0 ; i<2 ; i++ )                           //first matrix
		{
			for( j=0 ; j<2 ; j++ )                       //2nd matrix
			{
				System.out.println( "Sum of the martrix is  =    " +      x[ i ][ j ] );
			}

		}
	}
}
import java.util.Scanner;
class Factorial
{
    	  public static void main (String args[])
	   { 
	          Scanner obj = new Scanner (System.in);
	            int n,x,fact=1;
	    System.out.println("Enter any number");
	              n=obj.nextInt();
	              
	   x=n;
	          
	           while(n>=1)
	           {
                fact=fact*n;
	           	n--;
	           }
			    System.out.println("Factorial of number "+x+"is ="+fact);
	         }
	        }         
	  