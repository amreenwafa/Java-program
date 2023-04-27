class NumberToWordExample1   
{  
//user-defined static method that converts a number into words  
static void numberToWords(char num[]) 
{  
    //determines the number of digits in the given number  
    int len = num.length;  
    //checks the given number has number or not  
if (len == 0)   
{  
    //if the given number is empty prints the following statement     
System.out.println("The string is empty.");  
return;  
}  