package introduction.Conditions;

import java.util.Scanner;
public class decision {
    public static void main(String[]args)
    {
        Scanner age = new Scanner(System.in);

        System.out.println("enter your age:");

        int userAge = age.nextInt();

        if (userAge <=3){
            System.out.println("you are kid you are not eleigible to watch movies");
        }
        else if (userAge>=4 && userAge<=17)
            {
            System.out.print("you are teen and you are not elogible to watch a+ movie");

        }
        else if  (userAge>=18 && userAge<=60)
            {
            System.out.print("you are adult so u can watch a+ movie");
           }  
           else {
            System.out.print("you are eligible to watch move:");
           } age.close();
         } 
         
        }
    
