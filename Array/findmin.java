package Array;

import java.util.Scanner;

public class findmin {
    public static void min(int[]a){
        int max = a[0];
        for (int i = 1;i<a.length;i++){
            if (a[i]<max){
                max= a[i];
            }
        }
        System.out.println("the min values:"+max);
    }
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the how many value: ");
        int n = sc.nextInt();
        System.out.println("enter the value: ");
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        min(a);
    } 
}


