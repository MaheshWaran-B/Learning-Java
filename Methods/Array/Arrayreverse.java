package Methods. Array;
import java.util.Arrays; 
import java.util.Scanner; 

public class Arrayreverse {

    
    public static void revArray(int[] num) {
        int l = 0;
        int r = num.length - 1;
        while (l < r) {
            int temp = num[l]; 
            num[l] = num[r];
            num[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        
        int[] num = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        revArray(num);
        
    
        System.out.println("Reverse Array: " + Arrays.toString(num));
        
        sc.close(); 
    }
}
