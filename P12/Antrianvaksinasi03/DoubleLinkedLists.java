public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Enqueue(Pasien03 item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(current, item, null);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.nomerAntrian + ", " + tmp.data.namaPasien);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (size == 1) {
            System.out.println("Selesai Di vaksin");
            head = null;
            size--;
        } else {
            System.out.println(head.data.namaPasien + " Selesai Di vaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
