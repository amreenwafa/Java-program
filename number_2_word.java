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
//string type array of tens multiples   
//the first two indexes are empty because it makes indexing easy   
String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
//string type array of power of tens   
String[] poweroftens = new String[] {"Hundred", "Thousand"}; 
//Used for debugging purpose only   
//the valueOf() method returns the string representation of the character array argument  
System.out.print(String.valueOf(num) + ": ");  
//checks whether the length of the given string is one or not  
if (len == 1)   
{  
    //if the above condition returns true, it accesses the corresponding index and prints the value of that index  
//[num[0]-'0']: getting the number equal the decimal value of the character (assuming the char is the digit)  
System.out.println(onedigit[num[0]-'0']);  
return;  
}    