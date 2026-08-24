package Methods.Array;
import java.util.Scanner;



public class Example2 {
    static void printArray(String[]names){
        System.out.println( "names: ");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]+"");
    }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of elements: ");
        int size= sc.nextInt();

        String names [] = new String[size];
        System.out.println("enter array elements: ");

        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }
        
    printArray(names);
    


        
    }
}
