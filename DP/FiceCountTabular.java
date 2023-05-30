package DP;

public class FiceCountTabular {
    static void tbale(int cache[],int n){
        cache[n]=1;
       // cache[n-1]=1;
        for(int i=n;i>0;i--){
            int count=0;
            for(int j=i;j<=n;j++){
            cache[i-1]=cache[i-1]+cache[j];
            count++;
            if(count==6)
            break;
            }
        }
        System.out.println(cache[0]);
    }
    public static void main(String[] args) {
        int n=10;
        int cache[]=new int[n+1];
        tbale(cache, n);
    }
    
}
