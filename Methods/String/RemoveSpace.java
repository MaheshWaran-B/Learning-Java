package Methods.String;


public class RemoveSpace {
    public static void main(String[]args){
        String ask = "how are you?";
        String newString = "";

        for (int i =0;i<ask.length();i++){
            char ch = ask.charAt(i);
            
            if(ch ==' '){
             continue;
            }
        
            newString += ch; 
        
        }
            System.out.println(newString);
    }
    
    }

