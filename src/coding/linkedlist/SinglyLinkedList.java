package coding.linkedlist;

public class SinglyLinkedList<T> {

    Node head;
    int size;

    public SinglyLinkedList(){
        head = null;
        size=0;
    }
    public void add(T nodeValue){
        Node newNode = new Node(nodeValue);
        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void show(){
        if (head==null){
            System.out.println("No elements in the list");
            return;
        }
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.nodeValue);
            tmp = tmp.next;
        }
    }
    public void remove(int indexFromLast){
        int size = size();
        int count = 1;
        Node temp1 = head;
        Node temp2 = head.next;
        while(count <size - indexFromLast){
            temp1 = temp1.next;
            temp2 = temp2.next;
            count++;
        }
        temp1.next = temp2.next;
        size--;
    }
}
