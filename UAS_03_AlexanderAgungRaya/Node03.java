package UAS_03_AlexanderAgungRaya;

public class Node03 {
    Node03 prev;
    Node03 next;
    Object data;

    public Node03(Node03 prev, Object data, Node03 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}