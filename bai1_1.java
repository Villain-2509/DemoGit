import java.util.Scanner;

public class bai1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.println("Nhap thong tin sinh vien:");

        System.out.print("Ho va ten: ");
        String hoTen = scanner.nextLine();

        System.out.print("Lop: ");
        String lop = scanner.nextLine();

        System.out.print("Truong: ");
        String truong = scanner.nextLine();

        System.out.print("Gioi tinh: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Ngay sinh(dd/mm/yyyy): ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Que quan: ");
        String queQuan = scanner.nextLine();

        // In thông tin sinh viên đã nhập
        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Truong: " + truong);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Que quan: " + queQuan);
    }
}
