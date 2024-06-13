package UAS_03_AlexanderAgungRaya;

public class DoubleLinkedList03 {
    Node03 head;
    Node03 tail;
    int size;

    public DoubleLinkedList03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(BarangRental03 item) {
        Node03 newNode = new Node03(null, item, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(BarangRental03 item) {
        Node03 newNode = new Node03(tail, item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addLast(TransaksiRental03 item) {
        Node03 newNode = new Node03(tail, item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    public void display() {
        Node03 current = head;
        while (current != null) {
            if (current.data instanceof BarangRental03) {
                BarangRental03 br = (BarangRental03) current.data;
                System.out.println("No TNKB: " + br.noTNKB + ", Nama Barang: " + br.namaBarang +
                        ", Jenis Kendaraan: " + br.jeniskendaraan + ", Tahun: " + br.tahun +
                        ", Biaya Sewa: " + br.biayasewa);
            } else if (current.data instanceof TransaksiRental03) {
                TransaksiRental03 tr = (TransaksiRental03) current.data;
                System.out.println("Kode Transaksi: " + tr.kodeTransaksi + ", Nama Peminjam: " + tr.namaPeminjam +
                        ", Lama Pinjam: " + tr.lamaPinjam + " hari, Total Biaya: " + tr.totalbiaya +
                        ", No TNKB: " + tr.br.noTNKB);
            }
            current = current.next;
        }

        System.out.println("Jumlah data: " + size);
        System.out.println();

    }

    public int size() {
        return size;
    }

}