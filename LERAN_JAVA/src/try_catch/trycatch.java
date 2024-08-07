package try_catch;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vòng lặp vô hạn để nhập giá trị x và xử lý các ngoại lệ
        while (true) {
            System.out.print("Nhap x = ");
            try {
                int x = scanner.nextInt();
                try {
                    System.out.println("result 10/x = " + 10 / x);
                    break;
                } catch (Exception e) {
                    // Xử lý ngoại lệ nếu x = 0 và in thông báo lỗi
                    System.out.println("run error with x= " + x);
                }
            } catch (Exception e) {
                // Xử lý ngoại lệ khi người dùng không nhập số nguyên
                scanner.next(); // Làm sạch luồng đầu vào
                System.out.println("run error");
            }
        }
    }
}
