import java.util.Scanner;

public class GraphMain03 {
    public static void main(String[] args) throws Exception {
        Graph03 gedung = new Graph03(6);
        Scanner sc03 = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            choice = sc03.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc03.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc03.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    asal = sc03.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    gedung.neighbours(asal, tujuan);
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc03.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    int edgeCount = gedung.hitungEdge();
                    System.out.println("Jumlah edge dalam graf: " + edgeCount);
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 8);

        sc03.close();
    }
}
