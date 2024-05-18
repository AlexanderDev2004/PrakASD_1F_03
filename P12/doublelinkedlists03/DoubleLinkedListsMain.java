package P12.doublelinkedlists03;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.addFirst(3);
       dll.addLast(4);
       dll.addFirst(7);
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.add(40, 1);
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.clear();
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.addLast(50);
       dll.addLast(40);
       dll.addLast(10);
       dll.addLast(20);
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.removeFirst();
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.removeLast();
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.remove(1);
       dll.print();
       System.out.println("=======================");
       System.out.println("Size : "+ dll.size());
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.addFirst(3);
       dll.addLast(4);
       dll.addFirst(7);
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       dll.add(40, 1);
       dll.print();
       System.out.println("Size : "+ dll.size());
       System.out.println("=======================");
       System.out.println("Data Awal pada Linked list adalah : " + dll.getFirst());
       System.out.println("Data Akhir pada Linked list adalah : " + dll.getlast());
       System.out.println("Data index ke 1 pada linked list adalah: " + dll.get(1));

       
       
    }
}
