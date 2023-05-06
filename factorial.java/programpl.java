//Program of matrix of 2x2 oder     

class  MatrixAdd
{
	public static void main( String args[ ] )
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