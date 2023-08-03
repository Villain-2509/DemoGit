public class bai2_8 {
    public static void main(String[] args) {
        int count = 0; // Biến đếm số lượng số chẵn đã tìm thấy
        int sum = 0;   // Biến lưu trữ tổng của 10 số chẵn đầu tiên
        int currentNumber = 0; // Biến lưu trữ số hiện tại đang kiểm tra

        while (count < 10) { // Chạy vòng lặp cho đến khi tìm đủ 10 số chẵn
            if (currentNumber % 2 == 0) { // Kiểm tra xem số hiện tại có phải là số chẵn không
                sum += currentNumber; // Nếu là số chẵn, thêm vào tổng
                count++; // Tăng biến đếm số lượng số chẵn đã tìm thấy
            }
            currentNumber++; // Kiểm tra số tiếp theo
        }

        System.out.println("Tong cua 10 so chan dau tien la: " + sum);
    }
}