import java.util.Scanner;

public class bai2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong so nguyen duong (N): ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("\nNhap " + n + " so nguyen duong:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 || (num >= 100 && num / 100 % 10 == 3)) {
                sum += num;
            }
        }

        System.out.println("\nTong cac so chia het cho 4 hoac co chu so o hang tram la 3 la: " + sum);
    }
}