package P6;

public class MainBuku03 {
    public static void main(String[] args) {
        DaftarBuku03 listBuku03 = new DaftarBuku03();
        Buku03 m = new Buku03(20015, "Algoritma", 2019, "Wahyudi", 5);
        Buku03 m1 = new Buku03(21101, "Big Data", 2020, "susilo", 3);
        Buku03 m2 = new Buku03(20111, "Web program", 2020, "Pribadi joko", 6);
        Buku03 m3 = new Buku03(30444, "Desain UI", 2022, "Pusaka Adi", 2);
        Buku03 m4 = new Buku03(41021, "Etika mahasiswa", 2023, "Darwana Adi", 1);
        listBuku03.tambah(m);
        listBuku03.tambah(m1);
        listBuku03.tambah(m2);
        listBuku03.tambah(m3);
        listBuku03.tambah(m4);

        System.out.println("====================");
        System.out.println("Data Sebelum Diurutkan");
        listBuku03.tampil();

        System.out.println("====================");
        System.out.println("Data setelah diurutkan secara ASC berdasarkan Stock");
        listBuku03.BurbleShort();
        listBuku03.tampil();

        System.out.println("====================");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan Stock menggunakan selection short");
        listBuku03.selectionSort();
        listBuku03.tampil();
    }
}
