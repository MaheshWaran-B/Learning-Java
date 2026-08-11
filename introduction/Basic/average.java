package introduction.Basic;

import java.util.Scanner;
public class average {
    public static void main(String[]args)
    {
    Scanner num=new Scanner(System.in);
    System.out.print("enter the first number in float value: ");

    float a = num.nextFloat();

    System.out.print("enter the second number in float value:");

    float b = num.nextFloat();

    float c = (a + b)/2;

    System.out.print("the average value of a and b :"+c);  
    num.close(); 
}
}
