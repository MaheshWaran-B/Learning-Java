package Methods.Array;
import java.util.Scanner;

public class Sumofarray {
    public static int findArraysum( int[] nums){
    int sum =0;
    for(int i=0;i<nums.length;i++){
        sum = sum+nums[i];
    }
    return sum;
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the Array: "));
        int n =sc.nextInt();
        int []nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res = findArraysum(nums);
        System.out.println("sum: "+res);
        

    }
}
