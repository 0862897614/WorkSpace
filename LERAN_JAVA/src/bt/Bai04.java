package bt;
import java.util.Scanner;

public class Bai04 {

    public static void bai01() {
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

    public static void bai02() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.printf("Giai PT bac hai %dx^2 + %dx + %d = 0 \n ", a, b, c);

        if (a == 0) {
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

    public static void bai03() {
        System.out.println("Chuong trinh tinh tien dien");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so dien: ");
        float sodien = scanner.nextFloat();
        double money = (sodien <= 100) ? sodien * 1000 : 100 * 1000 + (sodien - 100) * 1500;
        System.out.printf("So dien phai thanh toan la %.3f :", money);
        scanner.close();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============= MENU ==============");
        System.out.println(" 1. Giai PT bac nhat");
        System.out.println(" 2. Giai PT bac hai");
        System.out.println(" 3. Chuong tinh tinh so dien");
        System.out.println(" 4. Thoat");
        System.out.println("++-------------==--------------++");
        System.out.print("Lua chon cua ban: ");

        int choosen = scanner.nextInt();

        switch (choosen) {
            case 1:
                bai01();
                break;
            case 2:
                bai02();
                break;
            case 3:
                bai03();
                break;
            case 4:
                System.out.println("Ban da thoat chuong trinh");
                System.exit(0);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }
    }
}
