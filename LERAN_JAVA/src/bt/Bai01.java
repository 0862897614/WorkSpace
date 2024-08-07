package bt;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so a = ");
        int a = scanner.nextInt();

        System.out.println("Nhap vao so b = ");
        int b = scanner.nextInt();

        System.out.printf("Giai pt bac nhat %dx + d = 0 \n ", a, b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so no");
            } else if (b != 0) {
                System.out.println("pt vo no");
            }
        } else {
            float x = -b / a;
            System.out.printf("PT co no phan biet la = %.3f ", x);
        }
    }
}
