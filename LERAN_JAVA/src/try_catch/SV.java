package try_catch;

import java.util.Scanner;

public class SV {
    public static Sinhvien nhapTT() {
        Scanner scanner = new Scanner(System.in);
        int msv, age;
        String hoTen;
        double diem;

        while (true) {
            try {
                System.out.print("Nhap ma SV: ");
                msv = scanner.nextInt();
                scanner.nextLine(); // xoa ky tu enter
                System.out.print("Nhap ho ten: ");
                hoTen = scanner.nextLine();
                System.out.print("Nhap diem: ");
                diem = scanner.nextDouble();
                System.out.print("Nhap tuoi: ");
                age = scanner.nextInt();

                Sinhvien sinhVien = new Sinhvien(msv, hoTen, diem, age);
                // Tao doi tuong Sinhvien moi va tra ve
                scanner.close();
                return sinhVien;
            } catch (Exception e) {
                System.out.println("Du lieu nhap khong hop le! Vui long nhap lai:");
                scanner.nextLine(); // xoa bo dem
            }
        }
    }

    public static void main(String[] args) {
        Sinhvien sinhVien = nhapTT(); // goi ham nhaptt va lay du lieu
        System.out.println("Thong tin sinh vien vua nhap: " + sinhVien);
    }
}
