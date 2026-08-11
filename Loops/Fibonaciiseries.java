package Loops;
public class Fibonaciiseries{
public static void main(String[]args){
    int num = 7;
    int first =0,second =1;

    
    for (int i = 1;i<=num;i++)
    {
       System.out.println(first+"");
       int next = first+second;
       first = second;
       second = next;
    }
}
} 