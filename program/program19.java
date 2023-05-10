public class program19 {
    	  public static void main (String args[])
	  {
        Scanner obj=new Scanner(System.in);
	  	int x,y,ch,z;
	  	System.out.println("Enter any two number");
	  	x=obj.nextInt();
	  	y=obj.nextInt();
	  	do
	  	{
            System.out.println("Select your choice");
	      System.out.println("Press 1 for addition");
	  	System.out.println("Press 2 for substracton"); 
	  	System.out.println("Press 3 for multiplication");
	  	System.out.println("Press 4 for division");
	  	ch=obj.nextInt();
	  	switch(ch)
	  	{
	  	  case 1:
	  	  {
	  	               z=x+y;
	  	               System.out.println("Additon of two number are =" +z);
	  	               break;
                    }
	  	  
                    case 2:
                    {
                                  z=x-y;
                                  System.out.println("Substraction of two number are=" +z);
                                  break;
                    }
                    
                    case 3:
                    {
                               z=x*y;
                               System.out.println("multiplication of two numbers are=" +z);
                               break;
                    }
                     
                    case 4:
                    {
						
	  	              z=x/y;
	  	              System.out.println("Division of two numbers are=" +z);
	  	              break;
	  	  }
    
}
