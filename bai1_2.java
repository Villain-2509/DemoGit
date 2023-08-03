import java.util.Scanner;

public class bai1_2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao hai so a va b tu nguoi dung
        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        // Tinh tong, hieu, tich, thuong va phan du cua hai so
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
        double phanDu = a % b;

        // In ket qua ra man hinh
        System.out.println("\n=> 2 so a va b co:");
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + phanDu);

        // Dong scanner
        scanner.close();
    } 
}
