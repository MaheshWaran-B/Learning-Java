package Methods.Pattern;

public class Reversepyramid {
    public static void main(String[]args){
        int n = 6;
        for (int i =n;i>=1;i--){

            System.out.println();

            for(int j=1;j<=i;j++)
                
                System.out.print("*"+" ");
        }
    }
}
