package Loops;
import java.util.Scanner;
public class Factorial {
   public static void main(String[]args){
    Scanner f = new Scanner(System.in);
    System.out.println("enter the num: ");
    int n = f.nextInt();
    int fact = 1;
    for (int i =1;i<=n;i++){
        fact = fact*i;
    }f.close();
    System.out.println(fact);
   } 
}
