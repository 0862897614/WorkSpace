package bt_OOP;

public class Object {
    public static void main(String[] args) {
        System.out.println("run product");

        Product obj1 = new Product();

        Product obj2 = obj1.nhapTT("Computer", 200, 0.1);
        obj1.hienthiTT(obj2);
        
        System.out.println("Tax = " + obj1.getTaxPrice(obj2.getPrice(), obj2.getTax()));
    }
}
