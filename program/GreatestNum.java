//Program of Finding the greatesrt on 12-10-21

import java.util.Scanner;
class GreateatNum
{
   public static void main(String args[])
     {
       Scanner obj=new Scanner (System.in);
           int a,b;
       System.out.println("Enter two number");
          a=obj.nextInt();
          b=obj.nextInt();
     
      if(a>b)
      System.out.println("first number is the greatest");

      else if(b>a)
      System.out.println("Second number is greatest");

      else 
      System.out.println("Both numbers are equal");
   }
}