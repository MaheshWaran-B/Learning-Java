package introduction.Conditions;
public class Checkprimenum {
    public static void main(String[]args){
int num =7;
boolean isprime = true;
for (int i=2;i<=num-1;i++){
    if(num%i==0){
        isprime=false;

    }
}
if(isprime==true){
    System.out.println("prime");
}
else{
        System.out.println("not prime");
}
}}
