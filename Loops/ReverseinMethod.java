package Loops;

public class ReverseinMethod {
    public int Reversenum(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev =rev*10+rem;
            n = n/10;

        }
        return rev;
    }
        public static void main(String[]args){
        ReverseinMethod obj = new ReverseinMethod();
        System.out.println("rev no : 12345   " + obj.Reversenum(12345));
    }
}
