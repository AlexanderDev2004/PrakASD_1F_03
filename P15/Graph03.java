public class Graph03 {
    int vertex;
    DoubleLinkedList03[] list;

    public Graph03(int v) {
        vertex = v;
        list = new DoubleLinkedList03[v];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList03();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        // Calculate total in-degree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }

        // Calculate total out-degree
        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) (asal + 'A') + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) (asal + 'A') + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) (asal + 'A') + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        boolean updated = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, newJarak);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Jarak berhasil diperbarui");
        } else {
            System.out.println("Edge tidak ditemukan");
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            edgeCount += list[i].size();
        }
        return edgeCount;
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println();
            }
        }
    }

    public void neighbours(int asal, int tujuan) throws Exception {
        boolean isFound = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                isFound = true;
                break;
            }
        }
        char asalChar = (char) ('A' + asal);
        char tujuanChar = (char) ('A' + tujuan);
        if (isFound) {
            System.out.println("Gedung " + asalChar + " dan gedung " + tujuanChar + " bertetangga");
        } else {
            System.out.println("Gedung " + asalChar + " dan gedung " + tujuanChar + " tidak bertetangga");
        }
    }
}
