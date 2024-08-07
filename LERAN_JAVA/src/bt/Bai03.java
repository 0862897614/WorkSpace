package bt;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {

        System.out.println("Chuong trinh tinh tien dien");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so dien: ");
        float sodien = scanner.nextFloat();
        double money = (sodien <= 100) ? sodien * 1000 : 100 * 1000 + (sodien - 100) * 1500;
        System.out.printf("So dien phai thanh toan la %.3f :", money);
        scanner.close();
    }
}
