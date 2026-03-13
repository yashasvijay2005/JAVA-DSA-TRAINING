package LinkedList;

class LL {
    Node head;
    private int size;

    public LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null; // We don't know the address of the next node
            size++; // Increment the size as soon as a node is created
        }
    }

    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+ "-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(String data) {
        // Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data) {
        // Create a new node
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }

        // If there are multiple nodes , we need to fing the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // At the end of this loop we will add the new node
        last.next = newNode;

    }

    

    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("Dsa ");
        sll.addFirst("Learning ");
        sll.addFirst("are ");
        sll.addFirst("We ");
        sll.addFirst("null ");
        sll.printList();
        
        sll.addLast("in");
        sll.addLast("JAVA");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
    }
}