package P14;

public class BinaryTreeArrayMain03 {
    static BinaryTreeArray03 bta = new BinaryTreeArray03();
    public static void main(String[] args) {
        int [] data = {6,4,8,3,5,7,9,10,15};
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.println("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.println("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.println("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");

        System.out.println("tambah 10 tree : ");
        bta.add(10);
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
