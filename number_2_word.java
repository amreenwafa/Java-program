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
//here, we have specified the length of the number to 4  
//it means that the number (that you want to convert) should be four or less than four digits  
if (len > 4)   
{  
    //if the given number is more than four-digit number, it prints the following statement    
System.out.println("\n The given number has more than 4 digits.");  
return;  
} 
 //string type array for one-digit numbers    
String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
//string type array for two digits numbers    
//the first index is empty because it makes indexing easy   
String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"}; 