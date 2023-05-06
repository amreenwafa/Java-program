// WAP a program of four functional calculator not mainu driven 
    //Coded By Amreen wafa on 26-7
    
    import java.util.Scanner;
    class FourFunCal
    {
    	public static void main (String args[])
    	{
    		Scanner obj=new Scanner(System.in);
    		int num1,num2,x,result;
    		
    		System.out.println("Please enter any two number");
    		num1=obj.nextInt();
    		num2=obj.nextInt();
    		
    		System.out.println("Select your choice");
    		System.out.println("Press1 for addition");
    		System.out.println("Press 2 for substraction");
    		System.out.println("Press 3 for multiplication");
    		System.out.println("Press 4 for division");
    		x=obj.nextInt();
    		
    		if(x==1)
    		{
    		    int add=num1+num2;
    		    System.out.println("Addition of two number is =" +add);
    		 }
            else if(x==2)
            {
                int sub=num1-num2;
                System.out.println("Substraction of two number is =" +sub);
             }
             else if(x==3)
             {
                int mul=num1*num2;
                System.out.println("Multiplication of two number is =" +mul);
              }
              else if(x==4)
              {
                 int div=num1/num2;
                 System.out.println("Division of two number is =" +div);
              }
               else 
               System.out.println("Sorry! You have entered wrong choice");
             
          }
  }               
                                  
                              		                  
    		                   