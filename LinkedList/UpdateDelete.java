package LinkedList.CRUD;

public class UpdateDelete<T> {
 Node<T> start;

void insertAtBeg(Node<T> node){
    //if node is empty
    if(start==null){
        start=node;
        return;
    }
    node.next=start;
    start=node;

}
/*void insertAtEnd(Node<T> node){
    //if node is null
    if(start==null){
        start=node;
        return;
    }
    //if LL has 1 node
    if(start.next==null){
        start.next=node;
        return;
    }
    Node<T> temp=start;
    while(temp!=null){
        temp=temp.next;
    }
    temp.next=node;
}
void insertAtMid(Node<T> node,int pos){
     //if node is null
     if(start==null){
        start=node;
        return;
    }
    //if LL has 1 node
    if(start.next==null){
        start.next=node;
        return;
    }
    int i=0;
    Node<T> temp=start;
    while(i<pos){
        temp=temp.next;
        i++;
    }
    node.next=temp.next;
    temp.next=node;
}*/
void deletAtBeg(){
    //if ll is empty
    if(start==null){
        return;
    }
    start=start.next;

}
void deletAtEnd(){
     //if ll is empty
     if(start==null){
        return;
    }
    Node<T> temp=start;
    Node<T> prev=temp.next;
    while(temp.next.next!=null){
       temp=temp.next;  
      // prev=prev.next; 
    }
    temp.next=null;
}
/*void deletAtMid(int pos){
    if(pos==0){
        start=start.next;
        return;
    }
    int i=1;
    Node<T> temp=start;
    while(i<pos){
        temp=temp.next;
        i++;
    }
    temp.next=temp.next.next;
}*/
void midPoint(Node<T> node){
    Node<T> slow;
    Node<T> fast;
   slow=fast=start;
   while(fast!=null&&fast.next==null){
    slow=slow.next;
    fast=fast.next.next;
   }
   System.out.println("MId POINT is"+slow.data);
}
void print(){
    Node<T> temp=start;
    while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
    }
}
 public static void main(String[] args) {
    UpdateDelete<Integer> obj=new UpdateDelete<>();
    obj.insertAtBeg(new Node<>(10));
    obj.insertAtBeg(new Node<>(20));
    obj.insertAtBeg(new Node<>(30));
    obj.insertAtBeg(new Node<>(40));
    obj.insertAtBeg(new Node<>(100));
    obj.print();
   // obj.deletAtMid(4);
  // obj.deletAtEnd();
  obj.deletAtBeg();
    System.out.println("HERE WE GO");
    obj.print();
 }
    
}
