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
}	 	