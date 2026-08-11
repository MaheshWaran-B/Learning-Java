package introduction.Conditions;
import java .util.Scanner;

public class Greatesnum {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the num 3 :");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3)
        {
            System.out.println("the num1 is greater ");
        }
          else if (num2>num3 && num2>num1)  {
            System.out.println("the num2 is graeter  ");
    

            }
            else if (num3>num1 && num3>num2){
                System.out.println("the num3 is greater");
            }else{
                System.out.println("the nums are equal");
            }sc.close();
        }

    }
    

