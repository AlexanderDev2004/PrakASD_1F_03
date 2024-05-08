package P10.Tugas03;

public class Queue03 {
    private pembeli03[] antrian;
    private int front, rear, size;
    private final int max;

    public Queue03(int n) {
        max = n;
        antrian = new pembeli03[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Pembeli antrian terdepan: " + antrian[front].nama + ", No.Hp: " + antrian[front].nohp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void enqueue(pembeli03 p) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = p;
            size++;
        } else {
            System.out.println("Antrian sudah penuh");
        }
    }

    public pembeli03 dequeue() {
        if (!isEmpty()) {
            pembeli03 p = antrian[front];
            front = (front + 1) % max;
            size--;
            return p;
        } else {
            System.out.println("Antrian masih kosong");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                System.out.print(antrian[i].nama + ", ");
            }
            System.out.println(antrian[rear].nama);
            System.out.println("Jumlah Antrian = " + size);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void Enqueue(pembeli03 dt) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public pembeli03 Dequeue() {
        pembeli03 dt = new pembeli03(null, front);
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            System.exit(0);
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Pembeli antrian terbelakang: " + antrian[rear].nama + ", No.Hp: " +
                    antrian[rear].nohp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("- Nama : " + antrian[i].nama + ", NoHp: " + antrian[i].nohp);
                i = (i + 1) % max;
            }
            System.out.println("- Nama : " + antrian[i].nama + ", NoHp: " + antrian[i].nohp);
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int currentPosition = front;
            int position = 1;
            boolean ditemukan = false;
            while (currentPosition != rear) {
                if (antrian[currentPosition].nama.equalsIgnoreCase(nama)) {
                    System.out.println("- Nama : " + antrian[currentPosition].nama + ", ada di posisi " + position);
                    ditemukan = true;
                }
                currentPosition = (currentPosition + 1) % max;
                position++;
            }
            if (antrian[currentPosition].nama.equals(nama)) {
                System.out.println("- Nama : " + antrian[currentPosition].nama + ", ada di posisi " + position);
                ditemukan = true;
            }
            if (!ditemukan) {
                System.out.println("Pembeli dengan nama '" + nama + "' tidak ditemukan dalam antrian");
            }
        }
    }

}
