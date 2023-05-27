package LinkedList.CRUD;

import java.util.List;

class ListNode{
    char data;
    ListNode next;
    ListNode(char data){
        this.data=data;
        this.next=null;
    }
}


public class Palindrome {
    ListNode start;
    ListNode reverseLinkedListRec(ListNode seconNode, ListNode prev) {
        if(seconNode == null) {
           // start = prev;
            return prev;
        }
        ListNode nextNode = seconNode.next;
        seconNode.next = prev;
       return reverseLinkedListRec(nextNode, seconNode);
    }
    void palind(ListNode node){
      ListNode slow;
      ListNode fast;
      ListNode prev=null;
      int count=0;
      slow=fast=start;
      while(fast.next!=null&&fast!=null){
        slow=slow.next;
        prev=slow;
        fast=fast.next.next;
       // count++;
      }
     // prev=null;
     if(fast!=null)//list is odd
     {

     }
     ListNode secondhalf=slow.next;
     reverseLinkedListRec(secondhalf, null);



    }
    void compare(ListNode node,ListNode secondhalf){
         while(node.next!=null&&secondhalf.next!=null){

         }
    }

    public static void main(String[] args) {
        ListNode node=new ListNode('M');
        node.next=new ListNode('A');
        node.next.next=new ListNode('D');
        node.next.next.next=new ListNode('A');
        node.next.next.next.next=new ListNode('M');
        Palindrome obj=new Palindrome();
        obj.palind(node);

        
    }
    
}
