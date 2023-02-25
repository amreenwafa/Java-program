
import java.util.Scanner;
public class ClothDis
 {
	public static void main(String[] args)
	 {
		Scanner obj=new Scanner(System.in);
		int  amount1, amount2;
		float dis;
		System.out.println("choose the item and enter the amount of money you spent");
		System.out.println("Enter the amout of money purchesed in mill cloth");
		amount1=obj.nextInt();
		
		System.out.println("Enter the amount of money you spent on handloom clothing");
		amount2=obj.nextInt();
		tot=amount1+amount2;
		System.out.println("total amount of money=" +tot);
		switch
		{
			case amount1
		if(amount1>=1&& amount2<=100)
		dis=amount1;
		else if(amount1>=101&&amount1<=200)
		dis=amount1-(5.00/100.00)*amount1;
		else if(amount1>=201&&amount1<=300)
		dis=amount1-(7.5/100.00)*amount1;
		else
		dis=amount1(10.00/100.00)*amount1;
		break;
		
		
		
		case amount2
		if(amount2>=0&& amount2<=100)
		dis=amount2;
		else if(amount2>=101&&amount2<=200)
		dis=amount2-(5.00/100.00)*amount2;
		else if(amount2>=201&&amount2<=300)
		dis=amount2-(10.0/100.00)*amount2;
		else
		dis=amount2(15.00/100.00)*amount2;
		break;
		
	 }
		
	  System.out.println("Discount he gets="+dis);
	  	
	
	
	}
}