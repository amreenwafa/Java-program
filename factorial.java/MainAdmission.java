//meritlist program on 27th August coded by Amreen wafa

import java.util.*;
public class Admission
 {
   string name;
   int m1,m2,m3,m4,m5,total;
   float per;
    
    void input()            //Input
    { 
      Scanner obj=new Scanner (System.in);
      System.out.println("Name of the student");
      name=obj.nextline();
      
      System.out.println("Please enter your marks of 5 syubject");
      m1=obj.nextInt();
      m2=obj.nextInt();
      m3=obj.nextInt();
      m4=obj.nextInt();
      m5=obj.nextInt();
       
      total=m1+m2+m3+m4+m5;
      per=(total/500)*100;
      
      System.out.println("your percentage="+per);
    }
      void meritList()
         {       
         if(m1>100&&m2>100&&m3>100&&m4>100&&m5>100)
         {
         System.out.println("Invalid marks! Please check an re-enter your marks again");
              input();
              meritList();
         }
                else if(m1>=45&&m2>=45&&m3>=45&&m4>=45&&m5>=45)     
        	{
      		if(per>=80)
      		System.out.println("congrats! You are in meritlist 1");
      		
      		else if(per>=60)
        	{
      		System.out.println("Congrats! You are in meritlist 2");
        	}
      		
      		else
      		System.out.println("you are in meritlist");
        	}
        else
      System.out.println("Sorry! you are not eligible for this because your individual marks is less than 45");
  }
 }
 
   class MainAdmission           
   {
	      public static void main(String[] args)
	       {
	       	Scanner kb=new Scanner(System.in);
	       	
	       	Admission adobj=new Admission();
	       	
	       	do
	       	{
	       	    obj.input();
	       	    obj.meritList();
	       	System.out.println(" To continue press 5 otherwise enter any key for exit");
	       	int ch=kb.nextInt();
	       	}while(ch==5);
	       	
	       }
   }
		
	
