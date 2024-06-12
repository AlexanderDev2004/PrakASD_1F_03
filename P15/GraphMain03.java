import java.util.Scanner;

public class GraphMain03 {
    public static void main(String[] args) throws Exception {
        Graph03 gedung = new Graph03(6);
        int attempt = 0;
        Scanner sc03 = new Scanner(System.in);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        // for (int i = attempt ; i < 2; i++) {
        //     System.out.println("Masukkan gedung asal: ");
        //     int asal = sc03.nextInt();
        //     System.out.println("Masukkan Gedung Tujuan: ");
        //     int tujuan = sc03.nextInt();
        //     gedung.Neighbours(asal, tujuan);
        //     System.out.println("");
        // }

        GraphMatriks03 gdg = new GraphMatriks03(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah pengahpusann edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}
