package P12.Film03;

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

    public void addFirst(Film03 item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film03 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film03 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
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
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.idfilm + ", " + tmp.data.judul + ", " + tmp.data.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list masih kosong");
        }
    }

    public String removeFirst() throws Exception {
        String tmpJdl = null;
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong tidak dapat dihapus");
        } else if (size == 1) {
            tmpJdl = removeLast();
        } else {
            tmpJdl = head.data.judul;
            head = head.next;
            head.prev = null;
            size--;
        }
        return tmpJdl;
    }

    public String removeLast() throws Exception {
        String tmpJdl = null;
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong tidak dapat dihapus");
        } else if (head.next == null) {
            tmpJdl = head.data.judul;
            head = null;
            size--;
            return tmpJdl;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        tmpJdl = current.data.judul;
        current.next = null;
        size--;
        return tmpJdl;
    }

    public String remove(int index) throws Exception {
        String tmpjdl = null;
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index diluar batas");
        } else if (index == 0) {
            tmpjdl = removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                tmpjdl = current.data.judul;
                current.prev.next = null;
            } else if (current.prev == null) {
                tmpjdl = current.data.judul;
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                tmpjdl = current.data.judul;
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
        return tmpjdl;
    }

    public Film03 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public Film03 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film03 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(double key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data.idfilm != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    public void sortByRatingDescPermanen() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Masih Kosong");
        }
        boolean swapped;
        do {
            Node current = head;
            swapped = false;
            while (current.next != null) {
                if (current.data.rating < current.next.data.rating) {
                    Film03 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        print();
    }

    public void sortByRatingDesSementara() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Masih Kosong");
        }
        Film03[] sortData = new Film03[size];
        Node temp = head;
        int idx = 0;
        while (temp != null && idx < size) {
            sortData[idx] = temp.data;
            temp = temp.next;
            idx++;
        }
        for (int i = 1; i < sortData.length; i++) {
            Film03 tmp = sortData[i];
            int j = i;
            while (j > 0 && sortData[j - 1].rating < tmp.rating) {
                sortData[j] = sortData[j - 1];
                j--;
            }
            sortData[j] = tmp;
        }
        System.out.println("|ID. |Judul |Rating |");
        for (Film03 film : sortData) {
            System.out.printf("|%-11d|%-15s|%-11.2f|\n", film.idfilm, film.judul,
                    film.rating);
        }
        System.out.println("Jumlah Film : " + size);
    }

    public void cariid(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cariid'");
    }
}
