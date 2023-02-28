//Finding armgstrong number

import java.util.Scanner;
class Armstrong
{
   public static void main(String args[])
    {
      Scanner obj=new Scanner (System.in);
       int n,temp,a=0,r;
      System.out.println("Enter any number");
         n=obj.nextInt()
           
       temp=n;
      while(n>0)
      {
       r=n%10;
       n=n/10;
       a=a+r*r*r;
      }

    if(a==temp)
     System.out.println("the number is armstrong");

     else
      System.out.println("the number is not armgstrong");
    }
}