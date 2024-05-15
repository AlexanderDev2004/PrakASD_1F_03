package P11.Tugas1;
public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    } 

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            int count = 1; 
            while (tmp != null) {
                System.out.println("mhs" + count + " \nnim : " + tmp.nim + " nama : " + tmp.nama);
                tmp = tmp.next;
                count++; 
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama){
        Node ndInput = new Node(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Node ndInput = new Node(nim, nama);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Node ndInput = new Node(nim, nama);
        Node temp = head;
        while (temp != null) {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int nim, String nama) {
        if (index < 0) {
            System.out.println("index harus >= 0");
            return;
        }
        if (index == 0) {
            addFirst(nim, nama);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        Node ndInput = new Node(nim, nama);
        temp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput;
        }
    }
}