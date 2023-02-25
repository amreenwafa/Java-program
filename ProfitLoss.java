//Program on profit loss

import java.util.Scanner; 
class ProfitLoss
{
       public static void main(String args[])
         { 
          Scanner obj=new Scanner (System.in);
            double cp,sp,profit,loss,profitper,lossper;

           System.out.println("Enter the amount of money you spend on buying the product");
            cp=obj.nextDouble();

          System.out.println("enter the amount of money you are going to sell the product");
            sp=obj.nextDouble();
          
          if(sp>cp)
           {
            profit=sp-cp;
             System.out.println("You have got profit of Rs=" +profit);
            profitper=(profit*100)/cp;
             System.out.println("your profit percent is" +profitper);
            }

          else
             {
               loss=cp-sp;
                System.out.println("You have loss of Rs=" +loss);
               lossper=(loss*100)/sp;
                System.out.println("Your loss percent is" +lossper);
             }
          }
}
            
