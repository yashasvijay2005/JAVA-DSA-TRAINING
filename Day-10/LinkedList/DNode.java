package LinkedList;
class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
    }
}
public class DoublyLinkedList {
static DNode head = null;

    static void insert(int data) {
        DNode newNode = new DNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
        }
    }
}