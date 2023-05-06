import java.util.Scanner;
class Personal
{
    string name;
    long pan_no, acc_no;
    float basic_ pay;

    void personal(string n, long p, long a, float b)
    {
       name = n;
       pan_no = p;
       acc_no = a;
       basic_sal = b;	  	  	
    }
    void display()
    {
        System.out.println("Name of the employee is =  "+  name);
        System.out.println("Pan no is =  "+  pan_no);
        System.println("Account no of the employee is =  "+  acc_no);
        System.out.println("Basic salary of the employee is =  "+  basic_pay);
    }
}  