package P12.Antrianvaksinasi03;

public class DoubleLinkedLists {
    Node head;
    Node tail;
    int size;
    int nomorAntrian;
    String nama;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int nomorAntrian, String nama) {
        Node newNode = new Node(nomorAntrian, head, tail);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }
    public void addLast(int nomorAntrian, String nama) {
        Node newNode = new Node(nomorAntrian, head, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public void add(int nomorAntrian, String nama) {
        Node newNode = new Node(nomorAntrian, nama);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("Nomor Antrian: " + tmp.nomorAntrian + ", Nama: " + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("Sisa antrian: " + size);
        }
    }
    


    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else if (size == 1) {
           clear();
           System.out.println("Antrian berhasil dihapus");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else if (size == 1) {
            clear();
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked list masih kosong");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indek di luar batas");
        } else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.nomorAntrian;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else {
            return head.nomorAntrian;
        }
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else {
            return tail.nomorAntrian;
        }
    }

    public boolean contains(int nomorAntrian) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.nomorAntrian == nomorAntrian) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public int indexOf(int nomorAntrian) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.nomorAntrian == nomorAntrian) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

}
