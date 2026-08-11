package Methods;
// with return type & without arguments
public class Type1 {
    public int addvalue(){
        int a = 9; int b = 10;
        int sum = a+b;
        return sum;

    }
    public static void main(String[]args){
    Type1 obj = new Type1();
    int result = obj.addvalue();
    System.out.println(result);
}}
