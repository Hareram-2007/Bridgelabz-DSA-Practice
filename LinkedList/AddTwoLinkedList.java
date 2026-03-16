import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class AddTwoLinkedList {

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node addLists(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;
        }

        return dummy.next;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node l1 = null;
        Node l2 = null;

        System.out.print("Enter number of nodes in first Linked List: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of first Linked List:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l1 = insert(l1, x);
        }

        System.out.print("Enter number of nodes in second Linked List: ");
        int m = sc.nextInt();

        System.out.println("Enter elements of second Linked List:");
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            l2 = insert(l2, x);
        }

        Node result = addLists(l1, l2);

        System.out.print("Result Linked List: ");
        display(result);
    }
}