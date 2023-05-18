package LinkedList.CRUD;
/*class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}*/
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
        this.next=null;
    }

    
}

public class Create {
    public static void main(String[] args) {
      /*   Node root=new Node(3);
        root.next=new Node(2);
        root.next.next=new Node(1);
        Node temp=root;
        while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
        }*/
        Node<String> root=new Node<>("Sangeet");
        root.next=new Node<>("Saurabh");
        root.next.next=new Node<>("Aadarsh");
        Node<String> temp=root;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    
}
