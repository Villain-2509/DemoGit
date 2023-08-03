import java.util.Scanner;

public class bai2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap gia tri N: ");
        int N = scanner.nextInt();

        System.out.print("Nhap gia tri M (M >= N): ");
        int M = scanner.nextInt();

        while (M < N) {
            System.out.print("M phai >= N. Nhap lai gia tri M: ");
            M = scanner.nextInt();
        }

        System.out.print("Nhap gia tri duoc chia K: ");
        int K = scanner.nextInt();

        int sum = 0;
        for (int i = N; i <= M; i++) {
            if (i % K == 0) {
                sum += i;
            }
        }

        System.out.println("\nTong cac so chia het cho " + K + " trong khoang tu " + N + " den " + M + " la: " + sum);

        scanner.close();
    }
}