package arrays;

public class largestno {
    static void solution(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(max<arr[i]){
                max=arr[i];
             }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={2,5,10,20,3,9};
        solution(arr);
    }
    
}
