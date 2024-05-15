package P11.SingleLinkedList;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList SingLL = new SingleLinkedList();
        SingLL.print();
        SingLL.addFirst(890);
        SingLL.print();
        SingLL.addLast(760);
        SingLL.print();
        SingLL.addFirst(700);
        SingLL.print();
        SingLL.addAfter(700, 999);
        SingLL.print();
        SingLL.inserAt(3, 833);
        SingLL.print();
    }
}
