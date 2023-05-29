import java.util.HashMap;

public class HashmapPrac {
    static HashMap<Character,Integer> getcount(String str,int indx,int length){
        if(indx==length){
            HashMap<Character,Integer> map=new HashMap<>();
            return map;
        }
        HashMap<Character,Integer> map=getcount(str, indx+1, length);
        char singleChar=str.charAt(indx);
        if(map.get(singleChar)==null){
            map.put(singleChar, 1);
        }
        else{
            int count =map.get(singleChar);
            map.put(singleChar, count+1);
        }
        return map;

    } 
    public static void main(String[] args) {
        String str="Sangeet";
        HashMap<Character,Integer> res=getcount("Sangeet", 0, str.length());
        System.out.println(res);
    }

    
}
