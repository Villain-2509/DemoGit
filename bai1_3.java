import java.util.Scanner;

public class bai1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        int soLonHon = (a > b) ? a : b;

        System.out.println("=> So lon hon la: " + soLonHon);

        sc.close();
    }
}