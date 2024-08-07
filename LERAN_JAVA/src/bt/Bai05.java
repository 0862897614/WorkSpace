package bt;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen bat ky: ");
        int isprime = scanner.nextInt();

        int count = 0;
        for (int i = 2; i < isprime - 1; ++i) {
            if (isprime % i == 0){
                System.out.println("Uoc so khac la: " + i);
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.printf("%d la so nguyen to: ", isprime);
        }
        else {
            System.out.println("%d khong phai so nguyen to: ");
        }
        scanner.close();
    }
}
