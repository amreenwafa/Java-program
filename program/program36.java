public class program36 {
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

                System.out.println("Enter the marks of Subject 2 : ");
                m2 = in.nextInt();

                System.out.println("
                
                
                System.out.println("Enter the marks of Subject 4 : ");
                m4 = in.nextInt();

                System.out.println("Enter the marks of Subject 5 : ");
                m5 = in.nextInt();
              }

			  
                     void meritList() 
             {

                if(m1>100||m2>100||m3>100||m4>100||m5>100) 
                {
 System.out.println("You have entered invalid marks. Please re-enter all marks properly");
                        input();
                        meritList();
                           }
                   else if(m1<45||m2<45||m3<45||m4<45||m5<45)
                {

                     System.out.println("Your individual subject marks are less ,You are not eligible as per the guidelines ");
                }
                 else

				 {
}
