public class Graph03 {
    int vertex;
    DoubleLinkedList03 list[];

    public Graph03(int v) {
        vertex = v;
        list = new DoubleLinkedList03[v];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList03();
        }
    }
    public void addEdge (int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    
    }
    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for(int i= 0 ; i< vertex; i++) {

            for (int j = 0; j< list[i].size();j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }

                for (k = 0; k < list[asal].size(); k++) {
                    list[asal].get(k);
                    ++totalOut;
                }
                totalOut=k;
            }
        }
        System.out.println("InDegree dari Gedung " + (char) (asal + 'A') + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) (asal + 'A') + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) (asal + 'A') + " : " + (totalIn + totalOut));
    }
    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char)('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char)('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
    }
}
