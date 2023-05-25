package Stack;

import java.util.HashMap;
import java.util.Stack;

public class Parenthesis {
   static boolean check(String s){
        HashMap<Character,Character> map=new HashMap<>();
        Stack <Character> st=new Stack<>();
        int top=-1;
        int i=0;
            map.put('(',')');
            map.put('[',']');
            map.put('{','}');
           for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //char x=st.peek();
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));  
            }
           else{
            
               char current= st.pop();
               current=map.get(current);
                if(current!=ch){
                    System.out.println("invalid bracket");
                    return false;
                }
            
           }

           }
           if(s==null){
            return true;
           }
           return true;
         
    }
    public static void main(String[] args) {
      
        String s="({{[]}))";
        boolean x=check(s);
        System.out.println(x);

    }
    
}
