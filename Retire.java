//Employ details 

import java.util.Scanner;
class Personal
{
	//Scanner obj=new Scanner(System.in);
	           string name;
	           long pan_no, acc_no;
	           float basic_ pay;
	           
	 /*System.out.println("Enter the name of the employee");
	            name=obj.nextLine(); 
	            
	  System.out.println("Enter pan card no of the employee");
	            pan_no=obj.nextLong();
	            
	  System.out.println("Enter the account no of the employee");
	            acc_no=obj.nextLong();
	            
	  System.out.println("Enter the basic salary of the emoloyee");
	            basic_pay=obj.nextFloat(); */
	            
	  void personal(string n, long p, long a, float b)
	  {
	     name = n;
	     pan_no = p;
	     acc_no = a;
	     basic_sal = b;	  	  	
	  }
	  
	  void display()
	  {
	  	System.out.println("Name of the employee is =  "+  name);
	  	System.out.println("Pan no is =  "+  pan_no);
	  	System.println("Account no of the employee is =  "+  acc_no);
	  	System.out.println("Basic salary of the employee is =  "+  basic_pay);
	  }
}  

class Retire extends personal
{
	//Scanner kb=new Scanner(System.in);
	          int yrs;
	         float pf, grat;
	         
	 
	          
	void Retire(string n, long p, long a, float b, int y, float pf)
	{
	                 super.personal(n,p,a,b,y,pf)
	                 yrs = y;
	                 pf = pf;
	                  
	 /*Sytem.out.println("Enter the year of service of the employee");
	          yrs=kb.nextInt();
	        
	  System.out.println("Enter the provident fund of the employee");
	          pf=kb.nextFloat();
	          
	   System.out.println("Enter the gratuity amount of the emplayee");
	          grat=kb.nextFloat();*/
	}
	
	
	void provident()
	{
	       pf=(2/100*basic_sal)*yrs;
	 System.out.println("provident fund of the employee is =  "+  pf);
	 	  
	}
	
	void gratuity()
	{
		grat=nil;
		if(years>=10)
		{
			    grat=12*basic_sal;
		   System.out.println("congratulation you get a gratuity amout of   "+  grat);
		}
		else
		("Your service years is less than 10 year so you wil not get gratuity ="+  nil);  
     }
     
      void diaplay()
      {
      	System.out.println("Service year of the employee is =  "+  yrs);
      	System.out.println("Provident fund of the employee is  ="+  pf);
      	System.out.println("Amount of gratuity of the employee is  ="+  grat);
      }         
}

class main
{
	public static void main(String args[])
	{
	System.out.println("Enter the employeee details carefully");
	
	Retire kb=new Retire(wafa,123467,457743545,20000,12,0);
	}
}