package bt;
import java.util.Scanner;

public class Bai02 {

    public static void giaiptbac1(int a, int b) {

        System.out.printf("Giai PT bac nhat %dx + %d = 0 \n ", a, b);
        if (a == b && b == 0) {
            System.out.println("PT vo so no");
        } else if (a == b && b != 0) {
            System.out.println("PT vo no");
        } else {
            float x = (float) -b / a;
            System.out.printf("PT co no phan biet la = %.5f ", x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.printf("Giai PT bac hai %dx^2 + %dx + %d = 0 \n ", a, b, c);

        if (a == 0) {
            giaiptbac1(b, c);
        } else {
            float delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (-b) / (2.0 * a);
                System.out.printf("Phuong trinh co nghiem kep x = %.3f", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet x1 = %.3f, x2 = %.3f", x1, x2);
            }
        }
        scanner.close();
    }
}
