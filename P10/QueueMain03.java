package P10;
import java.util.Scanner;

public class QueueMain03 {
    public static void menu () {
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. peek");
        System.out.println("4. print");
        System.out.println("5. clear");
        System.out.println("6. exit");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kapisitas queue : ");
        int n = sc.nextInt();
        Queue03 Q = new Queue03(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan data baru");
                    int datamasuk = sc.nextInt();
                    Q.enqueue(datamasuk);
                    break;
                case 2 :
                    int datakeluar = Q.dequeue();
                    if (datakeluar != 0) {
                        System.out.println("data yg keluarkan : " + datakeluar);
                    }
                    break;
                case 3 :
                    Q.peek();
                    break;
                case 4 :
                    Q.print();
                    break;
                case 5 :
                    Q.clear();
                    break;
                case 6 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("menu tidak tersedia");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}   
