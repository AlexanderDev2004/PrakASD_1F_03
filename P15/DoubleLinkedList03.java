public class DoubleLinkedList03 {
    Node03 head;
    int size;

    public void DoubleLinkedList03() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node03(null, item, jarak,null);
        } else {
            Node03 newNode = new Node03(null, item, jarak,head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node03 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node03 newNode = new Node03(current, item, jarak,null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, index);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node03 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node03 newNode = new Node03(null, item, index,current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node03 newNode = new Node03(current.prev, item, index,current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                newNode.next.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node03 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node03 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // public void remove(int index) {
    //     Node03 current = head;
    //     while (current!=null) {
    //         if (current.data == index) {
    //             if (current.prev == null) {
    //                 head = current.next;
    //                 current.next.prev = null;
    //             } else if (current.next == null) {
    //                 current.prev.next = null;
    //             } else {
    //                 current.prev.next = current.next;
    //                 current.next.prev = current.prev;
    //             }
    //         }
    //         current = current.next;
            
    //     }
    // }

    public void remove(int index) {
        Node03 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node03 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
