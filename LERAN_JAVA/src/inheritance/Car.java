package inheritance;

// con
public class Car extends Vehicle{
    private String modleName = "Mustang";

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modleName);
    }
}
