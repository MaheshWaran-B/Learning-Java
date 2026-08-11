package Loops;
public class Specialnum {
    public static void main(String[]args){
        int m = 12;
        int n = 55;
         for (int i = m; i<=n;i++){
           int dig1 = i%10;
           int dig2 = i/10;
           int sum = dig1+ dig2;
           int product = dig1*dig2;
           int result = sum+product;
       if(result==i){
System.out.println(result);
        
       }

        }
    }
}
