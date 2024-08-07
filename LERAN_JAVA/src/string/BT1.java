package string;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao username: ");
        String user = scanner.nextLine();

        System.out.print("Nhap vao password: ");
        String pass = scanner.nextLine();

        System.out.println("Username = " + user);
        System.out.println("Password = " + pass);

        if (user.equals("PhamNghia") && pass.length() > 6) {
            System.out.print(">> valid input");
        }
        scanner.close();
    }
}
