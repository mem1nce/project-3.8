import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliği için bir sayı giriniz: ");
        int n = scanner.nextInt(); // Elmasın yüksekliği (yarı yüksekliği)

        // Elmasın üst kısmı (üçgen)
        for (int i = 1; i <= n; i++) {
            // Boşluklar
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir satır atla
        }

        // Elmasın alt kısmı (ters üçgen)
        for (int i = n - 1; i >= 1; i--) {
            // Boşluklar
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir satır atla
        }
    }
}
