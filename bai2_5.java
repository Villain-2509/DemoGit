import java.util.Scanner;

public class bai2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" CHUONG TRINH GIAI PHUONG TRINH BAC NHAT ax + b = 0. ");

        System.out.println("\nNhap he so a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap he so b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }

        scanner.close();
    }
}