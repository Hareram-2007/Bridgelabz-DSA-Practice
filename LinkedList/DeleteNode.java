class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DeleteNode {

    static Node delete(Node head, int key){

        if(head == null) return null;

        if(head.data == key) return head.next;

        Node temp = head;

        while(temp.next != null && temp.next.data != key){
            temp = temp.next;
        }

        if(temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Original List: ");
        display(head);

        head = delete(head, 20);

        System.out.println();

        System.out.print("After Deletion: ");
        display(head);
    }
}