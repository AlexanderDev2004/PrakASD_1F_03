package Kuis2_02_Alexander_1F;

public class DoubleLinkedLists03 {
    Node03 head;
    Node03 tail;
    int size;

    public DoubleLinkedLists03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Enqueue(pembeli03 item, pesanan03 item2) {
        if (isEmpty()) {
            head = new Node03(null, item, null, item2);
            tail = head;
        } else {
            Node03 newNode = new Node03(tail, item, null, item2);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else {
            System.out.println("Antrian Terdepan: " + head.data.kodepesanan + ", " + head.data.namaPembeli + ", " + head.data.phoneNumber + " - " + head.next2.namaPesanan + " : " + head.next2.harga);
        }
    }

    public void peekRear() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else {
            System.out.println("Antrian Terakhir: " + tail.data.kodepesanan + ", " + tail.data.namaPembeli + ", " + tail.data.phoneNumber + " - " + tail.next2.namaPesanan + " : " + tail.next2.harga);
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node03 tmp = head;
            while (tmp != null) {
                System.out.println("Kode Pesanan: " + tmp.data.kodepesanan + ", Nama Pembeli: " + tmp.data.namaPembeli + ", No Telp: " + tmp.data.phoneNumber + ", Nama Pesanan: " + tmp.next2.namaPesanan + ", Harga: " + tmp.next2.harga);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void sortByName() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        Node03 current, index;
        pembeli03 tempData;
        pesanan03 tempOrder;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data.namaPembeli.compareToIgnoreCase(index.data.namaPembeli) > 0) {
                    tempData = current.data;
                    tempOrder = current.next2;
                    current.data = index.data;
                    current.next2 = index.next2;
                    index.data = tempData;
                    index.next2 = tempOrder;
                }
            }
        }
    }

    public void printSortedByName() {
        sortByName();
        print();
    }

    public int calculateTotalRevenue() {
        if (isEmpty()) {
            return 0;
        }

        Node03 tmp = head;
        int totalRevenue = 0;
        while (tmp != null) {
            totalRevenue += tmp.next2.harga;
            tmp = tmp.next;
        }
        return totalRevenue;
    }
}
