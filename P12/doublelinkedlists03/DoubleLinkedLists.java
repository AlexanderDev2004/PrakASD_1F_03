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

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (size == 1) {
            removeFirst();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i =0 ;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }


    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else {
            return head.data;
        }
    }
    
    public int getlast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } 
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indek di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
}
