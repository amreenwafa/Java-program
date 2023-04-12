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