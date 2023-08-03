/*
public class bai2_6 {
    public static void main(String[] args) {
        // Kich thuoc bang cuu chuong (đa gia su tu 1 đen 10)
        int size = 10;
        
        // Dung vong lap for de in ra bang cuu chuong
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // Can le phai va in ra ket qua
            }
            System.out.println(); // Xuong dong sau moi hang
        }
    }
}
*/

public class bai2_6 {
    public static void main(String[] args) {
        // In bang cuu chuong 2 đen 9
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                // Tinh ra ket qua
                int result = i * j;
                // In ra ket qua
                System.out.println(i + " x " + j + " = " + result);
            }
            // Xuong dong giua cac bang cuu chuong
            System.out.println();
        }
    }
}
