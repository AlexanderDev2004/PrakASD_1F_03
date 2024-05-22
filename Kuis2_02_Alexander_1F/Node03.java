package Kuis2_02_Alexander_1F;

public class Node03 {
    Node03 prev;
    pembeli03 data;
    Node03 next;
    pesanan03 next2;

    public Node03(Node03 prev, pembeli03 data, Node03 next, pesanan03 next2) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.next2 = next2;
    }
}
