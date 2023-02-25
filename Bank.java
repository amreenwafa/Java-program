//Program on bank By Amreen wafa


import java.util.Scanner;
class Bank
{
     public static void main(String args[])
      {
        Scanner obj=new Scanner (System.in);
        int p,r,si;
        int t,ch;
         System.out.println("Please enter the correct detail you have");
          do
           {
            System.out.println("Enter your choice");
            System.out.println("Press 1 for finding si/Simple intrest");
            System.out.println("Press 2 for finding principal");
            System.out.println("Press 3 for finding rate");
            System.out.println("Press 4 for finding time on given intrest");
                ch=obj.nextInt();
           switch(ch)
                 {
                  case 1:
                       {
                         System.out.println("Enter principal");
                         p=obj.nextInt();
                         System.out.println("Enter rate");
                         r=obj.nextInt();
                         System.out.println("Enter time in month");
                         t=obj.nextInt();
                         si=(p*r*t)/100;
                          
                         System.out.println("You have a intrest of"  +si +"%");
                        }
                  break;
                  case 2:
                       {
                        
                        System.out.println("Enter si");
                        si=obj.nextInt();
                        System.out.println("Enter rate");
                        r=obj.nextInt(); 
                        System.out.println("Enter time in month");
                        t=obj.nextInt();
                        p=(si*100)/(r*t);

                        System.out.println("You have a principal of "  +p);
                       }                 
                  break;
                  case 3:
                       {
                        System.out.println("Enter principal");
                        p=obj.nextInt();
                        System.out.println("Enter si");
                        si=obj.nextInt();
                        System.out.println("Enter rate");
                        t=obj.nextInt();
                        r=(si*100)/(p*t);
               
                        System.out.println("You have a rate of "  +r);

                       }
                  case 4:    
                       {
                        System.out.println("Enter si");
                        si=obj.nextInt();
                        System.out.println("Enter principal");
                        p=obj.nextInt();
                        System.out.println("Enter rate");
                        r=obj.nextInt();
                        t=(si*100)/(p*r);

                        System.out.println("You have a time of "  +t);
                       }
                  default:
                        System.out.println("You have inter invalid choice ");
                      }
                        System.out.println("To start again press 9");   
                        ch=obj.nextInt();
                  }while(ch==9);
                       
            
      }
}

