package coding.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedlist = new SinglyLinkedList();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.show();
        reverseLinkedlist(linkedlist.head);
        linkedlist.show();

    }

    private static Node reverseLinkedlist(Node linkedlist){
        Node prev = null;
        Node current = linkedlist;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        linkedlist = prev;
        return linkedlist;
    }
}
