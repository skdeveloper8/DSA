public class towerofhanoi {
    static void Tower(int  n,String src,String helpr,String dest){
       if(n==1){
        System.out.println(src+" TO "+dest);
        return;
       }
        Tower(n-1, src, dest, helpr);
        System.out.println(src+" TO "+dest);
        Tower(n-1, helpr, src, dest);
    }
    public static void main(String[] args) {
      Tower(3, "S", "H", "D");
        
    }
}
