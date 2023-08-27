package arrays;

public class kadansalgo {
    static void solution(int arr[]){
        int sum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
              currentSum+=arr[i];
              if(currentSum<0){
                currentSum=0;
              }
              if(currentSum>sum){
                sum=currentSum;
              }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        solution(arr);
    }
    
}
