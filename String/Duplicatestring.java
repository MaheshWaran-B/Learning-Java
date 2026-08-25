package String;


    import java.util.HashSet;

public class Duplicatestring{
    public static void main(String[] args) {
        String s = "hello world";
        
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // If it can't be added to 'seen', it's a duplicate
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}


