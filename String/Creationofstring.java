package String;

public class Creationofstring {
    public static void main(String[]args){
        String s1 = "java programming";

        //length of the string
        int len = s1.length();
        System.out.println("length of s1: " +len);

        //charAt () -> access a specific char
        char ch = s1.charAt(10);
        System.out.println("char at 10:"+ch);

        //subtring (begin Index, end Index+1)-> to find substring 
        String subs1 =  s1.substring(0,4);
        System.out.println("substring : "+ subs1);

        // to convert string to uppercase 
        System.out.println("uppercase:"+s1.toUpperCase());

        //to lowercase
        System.out.println("Lowercase: "+s1.toLowerCase());

        // to check the string is in or not 
        System.out.println(s1.contains("java"));

        //replace
         s1 = s1.replace("j","p");
         System.out.println(s1);
         
         //remove white space
         String remove = s1.replace(" ","");
         System.out.println(remove);




        

    }
}
