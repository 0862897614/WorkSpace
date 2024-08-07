package inheritance;

// Lớp SV (giả sử là lớp cha)
public abstract class SV {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    abstract void tinhDiem();  // method truu tuong 0 co body

    public SV(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    
    public double getPriceTax(){
        return this.price * this.tax;
    }
    public void info(){
        System.out.println("run info from parent");
    }
}
