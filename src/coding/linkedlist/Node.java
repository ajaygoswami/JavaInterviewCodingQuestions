package coding.linkedlist;

public class Node<T> {
    Node next;
    T nodeValue;

    public Node(T nodeValue){
        this.nodeValue = nodeValue;
        this.next = null;
    }
}
