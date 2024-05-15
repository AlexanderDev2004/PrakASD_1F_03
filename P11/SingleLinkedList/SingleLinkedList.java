package P11.SingleLinkedList;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, head);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void addAfter(int key, int input) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == key) {
                Node ndInput = new Node(input, tmp.next);
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        }
    }
    void inserAt(int index, int input) {
        Node ndInput = new Node();
        if (index < 0) {
            System.out.println("melebihi batas index");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail=temp.next;
            }
        }
    }
}
