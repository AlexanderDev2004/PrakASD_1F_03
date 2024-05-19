package P12.Antrianvaksinasi03;

class Node {
	int nomorAntrian;
    Node nama;
    Node prev;
    Node next;

    Node(int nomorAntrian, Node head, Node tail) {
        this.nomorAntrian = nomorAntrian;
        this.nama = tail;
        this.prev = null;
        this.next = null;
    }

    public Node(int nomorAntrian2, String nama2) {
        //TODO Auto-generated constructor stub
    }
}
