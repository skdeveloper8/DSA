package arrays;

public class rainWaater {
    static void solution(int arr[]){
       int  rightmax[]=new int[arr.length];
       int leftmax[]=new int[arr.length];
       //left max array
       leftmax[0]=arr[0];
       for(int i=1;i<leftmax.length;i++){
           leftmax[i]=Math.max(leftmax[i-1],arr[i]);
       }
       //right max
       rightmax[arr.length-1]=arr[arr.length-1];
       for(int j=arr.length-2;j>=0;j--){
        rightmax[j]=Math.max(arr[j], rightmax[j+1]);
       }


       int trappedWater=0;
       for(int i=0;i<arr.length;i++){
        int waterLevel=Math.min(leftmax[i], rightmax[i]);
        trappedWater+=waterLevel-arr[i];
       }
       System.out.println(trappedWater);
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        solution(arr);
    }
}
