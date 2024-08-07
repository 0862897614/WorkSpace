package bt_OOP;

public class Product {
    private String name;
    private double price;
    private double tax;

    // constructor
    public Product() {

    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product nhapTT(String name, double price, double tax) { // biến đối tượng Product sẽ trả về 1 đối tg
        Product pr = new Product(name, price, tax);
        return pr;
    }

    public void hienthiTT(Product pr) {
        System.out.println(" Name = " + pr.getName() + " | Price = " + pr.getPrice() + " | Tax = " + pr.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }

}
