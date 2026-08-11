package introduction.Basic;


import java.util.Scanner;
public class Calculate {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first numbe:");
    float a = sc.nextFloat();
    System.out.println("Select Operator : ");
    char ch = sc.next().charAt(0);
    System.out.println("Enter second number:");
    float b = sc.nextFloat();
    switch (ch) {
        case '+':
            System.out.println("sum of a and b is :"+(a+b));
            
            break;
            case '-':
            System.out.println("sum of a and b is :"+(a-b));
            
            break;
            case '*':
            System.out.println("sum of a and b is :"+(a*b));
            
            break;
            case '/':
            System.out.println("sum of a and b is :"+(a/b));
            
            break;
            default:
                System.out.println("invalid operator");
                break;
    }sc.close();
}
}
