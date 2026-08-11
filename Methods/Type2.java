package Methods;
// with return type & with arguments
public class Type2 {
    public int addvalue(int a,int b){
int sum = a+b;
return sum;

    }
    public static void main(String[]args){
    Type2 obj = new Type2();
    int result = obj.addvalue(8,9);
    System.out.println(result);
}
}