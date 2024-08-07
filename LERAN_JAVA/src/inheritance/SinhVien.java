package inheritance;

public class SinhVien {
    public static void main(String[] args) {
        SVIT st1 = new SVIT("Java", "165", "PhamNghia", 10, 1);
        System.out.println("st1 check = " + st1.getLanguage());

        SVCK st2 = new SVCK("Tu duy", "165", "PhamNghia", 10, 1);
        System.out.println("st2 check = " + st2.name);

    }
}
