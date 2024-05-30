package P14;

public class BinaryTreeMain03 {
    static BinaryTree03 bt = new BinaryTree03();
    public static void main(String[] args) {
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("PreOrder  Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("inOrder  Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("postOrder  Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete note 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder  Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Min Value : " + bt.minValue());
        System.out.println("Min Value : " + bt.maxValue());

    }
}
