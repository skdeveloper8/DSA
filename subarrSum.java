package arrays;

public class subarrSum {
    static void solution(int arr[]){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
             // System.out.print("(");
              int currentSum=0;
              for(int k=i;k<=j;k++){
                 currentSum+=arr[k];
                 
              }
              if(currentSum>sum){
                sum=currentSum;
              }
              //System.out.print(")");
          }
          //System.out.println();
        }
        System.out.println(sum);
      }
      public static void main(String[] args) {
          int arr[]={1,-2,6,-1,3};
          solution(arr);
      }
    
}
