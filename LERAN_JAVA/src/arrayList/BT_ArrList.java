package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BT_ArrList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<Double>(); // ArrayList để lưu trữ các số thực

        // Vòng lặp để nhập các số thực từ người dùng
        while (true) {
            System.out.print("Nhập vào 1 số thực bất kỳ: "); // Yêu cầu người dùng nhập số thực

            double input = scanner.nextDouble(); // Đọc số thực từ bàn phím
            arrNumber.add(input); // Thêm số thực vào ArrayList
            scanner.nextLine(); // Đọc ký tự xuống dòng còn lại

            System.out.print("Tiếp tục ? Nhập Y hoặc N: ");
            String option = scanner.nextLine(); // Đọc lựa chọn của người dùng (tiếp tục hay không)

            if (option.equalsIgnoreCase("N")) { // Kiểm tra nếu người dùng muốn dừng lại (không phân biệt chữ hoa thường)
                break; // Thoát khỏi vòng lặp nếu người dùng nhập 'N' hoặc 'n'
            }
        }

        // In ra các số trong ArrayList
        System.out.println("Các số trong mảng: " + arrNumber);

        double sum = 0;
        // Tính tổng các số trong ArrayList
        for (int i = 0; i < arrNumber.size(); ++i) {
            sum += arrNumber.get(i); // Truy cập từng phần tử bằng chỉ số và cộng vào tổng
        }
        System.out.println("Tổng các phần tử trong mảng = " + sum); // Hiển thị tổng
    }
}
