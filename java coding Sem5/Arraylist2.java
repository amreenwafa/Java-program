import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Arraylist2
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
   ArrayList<String> n = new ArrayList<String>();
   String name; 
   
    for(int i=0; i<10; i++)
    {
       System.out.println("Enter the name of student");
       name = sc.nextLine();  
       n.add(name); 
       
    } 
    Collections.sort(n);
      
       for(int i=0; i<10; i++)
     {
       System.out.println(n.get(i));
     }
    
  }

}
