public class GraphMatriks03 {
    int vertex;
    int [][] matriks;

    public GraphMatriks03(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
        
    }
    // public void removeEdge (int asal, int tujuan) {
    //     matriks[asal][tujuan] = -1;
    // }
    public void removeEdge (int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }
    public void printGraph(){
        for(int i = 0; i < vertex; i++){
            System.out.print("Gedung " + (char)('A' + i) + " terhubung dengan: ");
            for(int j = 0; j < vertex; j++){
                if (matriks[i][j] != -1) {
                    System.out.print("" + (char)('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println("");
        }
    }
    public void deggre(int node3){
        int InDegree = 0, OutDegree = 0;

        for(int i = 0; i < vertex; i++){
            if (matriks[node3][i] != 0) {
                OutDegree++;
            }
            if (matriks[node3][i] != 0) {
                InDegree++;
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + node3) + " : " + InDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + node3) + " : " + OutDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + node3 ) + " : " + (InDegree + OutDegree));
    }
}
