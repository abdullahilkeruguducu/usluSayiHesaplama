import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz :");
        n = input.nextInt();

        System.out.print("Us olacak sayiyi giriniz :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total*=n;
        }
        System.out.println("Cevap : " + total);
    }
}