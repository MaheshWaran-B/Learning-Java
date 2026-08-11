package introduction.Basic;
 import java.util.Scanner;
 public class userinput {
    public static void main(String[] args)
    { 
    Scanner in = new Scanner(System.in);
    System.out.println("enter a name:");
    String name = in.nextLine();
    System.out.println("enter your reg no :");
    long regno = in.nextLong();
    in.nextLine();
    System.out.println("enter your department :");
    String department = in.nextLine();
    System.out.println("enter your cgpa:");
    float cgpa = in.nextFloat();
    in.close();
    System.out.println("name" + name);
     System.out.println("regno" + regno);
      System.out.println("department" + department);
       System.out.println("cgpa" + cgpa);

       


    }
    
}
