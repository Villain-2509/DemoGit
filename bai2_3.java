import java.util.Scanner;

public class bai2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong so nguyen (N): ");
        int N = scanner.nextInt();

        int soNguyenAm = 0;
        int soNguyenDuong = 0;
        int so0 = 0;

        System.out.println("Nhap " + N + " so nguyen:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num < 0) {
                soNguyenAm++;
            } else if (num > 0) {
                soNguyenDuong++;
            } else {
                so0++;
            }
        }

        System.out.println("\nSo luong so nguyen am la: " + soNguyenAm);
        System.out.println("So luong so nguyen duong la: " + soNguyenDuong);
        System.out.println("So luong so 0 la: " + so0);

        scanner.close();
    }
}