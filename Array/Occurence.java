package Array;
public class Occurence {
    public static void main(String[]args){
        int num[]= {12,3,12,12,33,12};
        boolean visited[]=new boolean[num.length];
        int len = num.length;
        for (int i = 0; i<len;i++){
        if(visited[i]==false){
            int count =1;
            visited[i] =true;
            for(int j=i+1;j<len;j++){
                if(num[i]==num[j]){
                    count++;
                    visited[j]=true;

                }
            }
            System.out.println(num[i]+ "-> " +count);
        }
        }
    }
    
}
