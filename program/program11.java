//import required classes and packages   
import java.util.Scanner;  
  
//create ATMExample class to implement the ATM functionality  
public class ATMExample  
{ 
      //main method starts   
      public static void main(String args[] )  
      {  
          //declare and initialize balance, withdraw, and deposit  
          int balance = 100000, withdraw, deposit;  
            
          //create scanner class object to get choice of user  
          Scanner sc = new Scanner(System.in);  
            
          while(true)  
          {  