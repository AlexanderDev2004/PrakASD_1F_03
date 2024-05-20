package P12.Film03;

public class Node {
    Film03 data;
    Node prev,next;

    Node (Node prev, Film03 data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
