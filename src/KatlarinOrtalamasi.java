import java.util.Scanner;

public class KatlarinOrtalamasi {
    public static void main(String[] args) {
        int k, num, t = 0, n = 0;
        Scanner data = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        k = data.nextInt();
        for (num = 0; num <= k; num++) {
            if (num % 3 == 0 && num % 4 == 0) {
                n++;
                t += num;
            }
        }
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + t / (n - 1));
    }
}
