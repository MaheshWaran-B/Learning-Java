package Methods.Array;
import java.util.HashMap;
import java.util.Map;

public class HashmapIntro {
    public static void main(String[]args){
        HashMap<String,String> map = new HashMap<>();

        // to store key value pairs in hashmap
        map.put("Area" , " saravanampatti");
        map.put("house no" ,   " 40c");
        map.put("district" , " covai");
        map.put("name" , " lohith");
        System.out.println("original map: "+ map);

        //put (key, updated value)  update the elemment in hash map
        map.put("house no", "41c");
        System.out.println("after the update of house no :"+ map);

        // get() using the key get the value
        System.out.println(map.get("Area"));

        //containsvalue to check the key is exist on map
        System.out.println("name contains?"+map.containsValue(" lohith"));
         //containskey to check the key is exist on map
                System.out.println("district contains?"+map.containsKey("district"));

        // find the six of map
        System.out.println(map.size());

        // remove any element using key
        map.remove("Area");

        System.out.println(map);

       // iterate over map
       for(Map.Entry<String,String> dataset : map.entrySet()){
        String key = dataset.getKey();
        String value = dataset.getValue();
        System.out.println(key+":"+value);

       }
       //print only key from hashmap
        System.out.println(map.keySet());
            }
    
}
