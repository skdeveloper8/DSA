public class FindFromLast{
    Node start;
    void insertAtBeg(Node<T> node){
        //if node is empty
        if(start==null){
            start=node;
            return;
        }
        node.next=start;
        start=node;
    
    }
    static void last(){

    }

    public static void main(String[] args) {
        FindFromLast<Integer> obj=new FindFromLast<>();
    obj.insertAtBeg(new Node<>(10));
    obj.insertAtBeg(new Node<>(20));
    obj.insertAtBeg(new Node<>(30));
    obj.insertAtBeg(new Node<>(40));
    obj.insertAtBeg(new Node<>(100));
    }
}
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
        this.next=null;
    }

    
}