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
    void add(int data) {
        if (idxlast + 1 < this.data.length) {
          idxlast++;
          this.data[idxlast] = data;
        } else {
          System.out.println("The tree is full. Cannot add more elements.");
        }
      }
    
      void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
          System.out.print(this.data[idxStart] + " ");
          traversePreOrder(2 * idxStart + 1);
          traversePreOrder(2 * idxStart + 2);
        }
      }
    
      void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
          traversePostOrder(2 * idxStart + 1);
          traversePostOrder(2 * idxStart + 2);
          System.out.print(this.data[idxStart] + " ");
        }
      }
}
