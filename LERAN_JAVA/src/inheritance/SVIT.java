package inheritance;
public class SVIT extends SV {
    private String language;

    public SVIT(String language, String id, String name, double price, double tax) {
        super(id, name, price, tax); // Gọi constructor của lớp cha
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney() {
        System.out.println("Chạy get money");
        super.info(); // Gọi phương thức info() của lớp cha SV
    }

    // Ghi đè phương thức info() của lớp cha SV
    @Override
    public void info() {
        System.out.println("Chạy info từ SVIT");
    }

    @Override
    void tinhDiem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tinhDiem'");
    }
}