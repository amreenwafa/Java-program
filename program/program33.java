public class program33 {
    public static void main (String args[])
	   {
           Scanner obj = new Scanner (System.in);
	            int n,x,fact=1;
	    System.out.println("Enter any number");
	              n=obj.nextInt();
                         
	           x=n;
	          
	           while(n>=1)
	           {
                  fact=fact*n;
	           	n--;
	           }
	         System.out.println("Factorial of number "+x+"is ="+fact);
	         }
    
}
