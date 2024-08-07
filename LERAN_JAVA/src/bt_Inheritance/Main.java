package bt_Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        SinhVien it1 = new SinhVienIT(10, 7); // tinh da hinh
        System.out.println("Sinh vien it score = " + it1.getScore());

        SinhVien ck1 = new SinhVienCK(6,9);
        System.out.println("Sinh vien ck score = " + ck1.getScore());

    }
}
