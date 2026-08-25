package String;

public class matchingornot {
    public static void main(String[]args){
        String name = "rahul";
        // to check the string is same or not (without case sensitive)
        boolean issame = name.equals("rahul");
        System.out.println(issame);
        // with case sensitive
        boolean issame1= name.equals("Rahul");
        System.out.println(issame1);
    }
}
