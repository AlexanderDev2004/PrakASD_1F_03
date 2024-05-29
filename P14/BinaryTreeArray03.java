package P14;

public class BinaryTreeArray03 {
    int [] data;
    int idxlast;

    public BinaryTreeArray03() {
        data = new int[10];
    }
    void populateData(int data [], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }
    void  traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);

        }
    }
}
