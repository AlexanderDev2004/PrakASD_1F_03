package P8.Postfix;
import java.util.Scanner;

public class PostfixMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P;
        System.out.println("Masukan ekpresi matematika (Infix) :");
        String Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix03 post = new Postfix03(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
