import java.util.Scanner;
class Admission 
   {
     String Name;
        int m1, m2, m3, m4, m5;
        float per,tMarks=500.0f;
        Scanner in = new Scanner(System.in);
 //Input
              void input() 
              {
                System.out.println("Enter Your Name");
                Name = in.nextLine();

                System.out.println("Enter the marks of Subject 1 : ");
                m1 = in.nextInt();
