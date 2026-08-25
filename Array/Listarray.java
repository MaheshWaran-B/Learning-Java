package Array;
import java.util.ArrayList;



public class Listarray {
    public static void main(String[]args){

//Declare Arraylist-> string
    ArrayList<String> list = new ArrayList<>();

//add()-> to insert the element end of the ArrayList
    list.add("is");
    list.add("a");

//addFirst()-> to add the element front of Arraylist
    list.addFirst("he");

// add last()-> to add the element last of array list
    list.addLast("good");
    list.addLast("boy");

//set()-> to replace the elmenent in a specific index position
   list.set(3,"bad");
   list.add(2,"also");


/*get(index)-> to retrieve an element from the list 
System.out.println("second element :"+list.get(1));
System.out.println(list.size());
for(int i =0;i<list.size();i++){
    System.out.println(list.get(i));
*/
//retrieve data using the for each loop
System.out.println("retrieve data using for each loop :");
for(String s:list){
    System.out.println(s+"");
}
}
//System.out.println(list); 
}

