public class bai2_7 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        int count = 0;
        System.out.println("Cac so nguyen chia het cho 3 hoac 7 trong doan tu 1 den 100 la:");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n\nSo luong cac so nguyen chia het cho 3 hoac 7 la: " + count);
    }
}