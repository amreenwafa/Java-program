import java.util.Scanner;
class BankAccount                    //Super class
 {
	Scanner obj=new Scanner(System.in);
	
	      String name;
	      double acc_no;
	      float dep, wdrl, bal=1000;
	      long num;

          void input()                    //Display
	      {
	      	System.out.println("Enter your name");
	      	name=obj.nextLine();
	      	System.out.println("Enter your account number");
	      	acc_no=obj.nextDouble();
	      	System.out.println("Enter  mobile number");
	      	num=obj.nextLong();
	      }

          void display()                    //Display
	      {
	      	System.out.println("Your name is" +name);
	      	System.out.println("Your account number is"   +acc_no);
	      	System.out.println("Your mobile number is"    +num);
	      	System.out.println("Your current balance is"   +bal);
	      }
		  void deposit()                     //Deposit
	      {
	      	System.out.println("Kindly enter the amount of money you want to deposit");
	      	dep=obj.nextFloat();
	      	bal=bal+dep;
	      	System.out.println("Your total ammout of money after deposit is"   +bal);
	  	}
		  void withdraw()                         //Withdraw
		  {
			   System.out.println("Enter the amount of money you want to transact");
			   wdrl=obj.nextFloat();
			   
				   if(wdrl<=bal)
				   {
					bal=bal-wdrl;
					System.out.println("Your remainig balance after transection is"   +bal);
					}
					
					else
					System.out.println("Sorry you cannot transact your amount, Insufficient Balance");
		  }
		  class Saving extends BankAccount               //Sub\ inherit class
  {
        float si, rate;
        int month;
        void input()

		{
			super.input();               //Taking input in Super
			System.out.println("Enter rate of intrest");
			rate=obj.nextFloat();
			System.out.println("You will get" +rate+"%");
		   System.out.println("Enter the month you want an intrest for");
			month=obj.nextInt();
}
void intrest()                           //To display the amount of intrest
{              
				   si=((bal*rate*month)/(100*12));
				   System.out.println("Amount of interst is" +si);
}
}       	
class InherBank                           
	  {
	      	public static void main(String args[])
	      	{
	      		int ch;
	      		Scanner sc=new Scanner(System.in);
	      		Saving kb=new Saving();
	      		System.out.println("WELCOME! To HDFC bank");
	      		System.out.println("Please enter your correct detail");
	      		kb.input();
				  do
	      		{
	      			System.out.println("Enter your choice");
	      			System.out.println("Press1 for display");
	      		    System.out.println("Press 2 for deposit");  
	      			System.out.println("Press 3 for withdraw");
	      			System.out.println("Press 4 for intrest");
	                 ch=sc.nextInt();     
					 switch(ch)
					 {		
						 
							  case 1:kb.display();
							  break;
							   case 2:kb.deposit();
							   break;
							   case 3:kb.withdraw();
							   break;
								case 4:kb.intrest();
								break;
								default: 
								System.out.println("Invalid choice");
					 }
					 System.out.println("Press 0 to continue");
					 ch=sc.nextInt();
					 }while(ch==0);
					 
								 
						 }
				   }  		