package introduction.Basic;
import java.util.Scanner;
public class sum{
    public static void main(String[]args)
    {Scanner num=new Scanner(System.in);
      System.out.print("enter the first number :");
      int a = num.nextInt();
      System.out.print("enter the second number :");
      int b = num.nextInt();
      int c = a+b;
              System.out.print("the sum of a and b is :" + c);
              num.close();
    }
}
