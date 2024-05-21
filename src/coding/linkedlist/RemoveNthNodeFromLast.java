package coding.linkedlist;

public class RemoveNthNodeFromLast {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        list.show();
        list.remove(2);
        list.show();
    }
}
