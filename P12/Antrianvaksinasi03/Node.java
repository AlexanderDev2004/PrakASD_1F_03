public class Node {
    Pasien03 data;
    Node prev,next;

    Node (Node prev, Pasien03 data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
