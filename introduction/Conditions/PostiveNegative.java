package introduction.Conditions;
import java.util.Scanner;
public class PostiveNegative{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter daily profit:");

    float profit = sc.nextFloat();

    if (profit>0)
        {
        System.out.println("the today profit is positive");
    }

        else if(profit<0)
            {
            System.out.println("today profit is negative");
        }
            else{
                System.out.println("the today profit is zero");
            }sc.close();
        }
        
    }


    

