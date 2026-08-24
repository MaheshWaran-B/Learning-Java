package Methods.Array;
import java.util.HashSet;


public class HashsetIntro {
    public static void main(String[]args){
        //declare -> integer
        HashSet<Integer> set = new HashSet<>();

        //add() - to add the element in Hashset
        set.add(6);
        set.add(5);
        set.add(5);
        set.add(55);
        set.add(66);
        set.add(33);
        set.add(55); 
              System.out.println("original hashset:"+set);
              set.add(4);
              System.out.println("after adding 4 :"+set);

              //to check the element is contain or not in hash set
              System.out.println("is 55 contain : "+set.contains(55));

              //revoming element
              set.remove(55);
              System.out.println("after removing 55: "+set);

              //for each loop to iterate over hash set
              for (int num: set){
                System.out.println(num+" ");
              }
              // removes everything from hashset
              set.clear();
              System.out.println("clears the set: "+set);
    }
    
}
