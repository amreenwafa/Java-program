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
		