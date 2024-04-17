package P8;

public class StackKonversi {
    static int tumpukanBiner[] ;
    static int Size;
    static int Top;

    public StackKonversi (int Kapasitas) {
        Size = Kapasitas;
        tumpukanBiner = new int[Size];
        Top = -1;
    }
    public Boolean CekKosong () {
        return Top == -1;
    }
    public boolean isfull() {
        return Top==Size-1;

    }
    public void push(int data) {
        if (isfull()) {
            System.out.println("Stack penuh ");
        } else {
            Top++;
            tumpukanBiner[Top] = data;
        }    
    }     
    public int pop() {
        if (CekKosong()) {
            System.out.println("Stack Kosong ");
            return -1;
        } else {
            int data = tumpukanBiner[Top];
            Top--;
            return data;
        }
    }    
}    