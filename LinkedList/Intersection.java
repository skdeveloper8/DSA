package LinkedList.CRUD;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode temp1=headA;
        ListNode temp2=headB;
        ListNode slow,fast;
        slow=fast=headA;
        ListNode slow2,fast2;
        slow2=fast2=headB;
        int count1=0;
        int count2=0;
            while(slow!=null){
               slow=slow.next;
              count1++;
            }
            while(slow2!=null){
                slow2=slow2.next;
              count2++;
             }
             int x=Math.abs(count1-count2);
             if(count1>count2){
                 while(x-->0)
                 temp1=temp1.next;
             }
             else{
                 while(x-->0)
                 temp2=temp2.next;
             }

             while(temp1!=temp2){
                temp1=temp1.next;
                  temp2=temp2.next;
              if( temp1==null||temp2==null){
                  
                    return null;
              }
            }
          return temp1;
        
    }
}