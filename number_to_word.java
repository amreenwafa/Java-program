import java.text.DecimalFormat;  
public class NumberToWordExample2   
{  
    //string type array for one digit numbers     
private static final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};  
//string type array for two digits numbers   
private static final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};  
//defining constructor of the class
private NumberToWordExample2()   
{  
}  

//user-defined method that converts a number to words (up to 1000)  
private static String convertUptoThousand(int number)   
{  
String soFar;  
if (number % 100 < 20)  
{  
    soFar = onedigit[number % 100];  
number = number/ 100;  
}  
else   
{  
    soFar = onedigit[number % 10];  
number = number/ 10;  
soFar = twodigits[number % 10] + soFar;  
number = number/ 10;  
}  
if (number == 0)   
return soFar;  
return onedigit[number] + " Hundred " + soFar;  
}  