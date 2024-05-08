package P10.Pratikum1_03.Pratikum1_03;

public class Queue03 {
    int data[];
    int front;
    int rear ;
    int size;
    int max;

    public Queue03 (int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println("element terdepan :" + data[front]);
        } else {
            System.out.println("Queue Kosong");
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("jumlah element = "+ size);
        }
    }
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queque berhasil di hapus");
        } else {
            System.out.println("Queue masih Kosong");
        }
    }
    public void enqueue(int dt) { 

        if (isFull()) {
            System.out.println("queque sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
              
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public int dequeue() {
        int dt = 0; 
        if (isEmpty()) {
            System.out.println("queque masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            return dt;
        }
        return dt;
    }
}    
   