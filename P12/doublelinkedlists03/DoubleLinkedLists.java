package P12.doublelinkedlists03;

public class DoubleLinkedLists {
    Node head;
    Node tail;
    int size;
    
    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        Node newNode = new Node(item, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }
    
    
    public void addLast(int item) {
        Node newNode = new Node(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }
    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty()) {
            addFirst(item);
        } else if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(item, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public int size () {
        return size;
    }
    public void clear () {
        head = null;
        size = 0;
    }
    public void print () {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil di isi");
        } else {
            System.out.println("Linked list masih kosong");
        }
    }
}
