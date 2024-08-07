package polymorphism;

class Aniaml{
    public void eat(){
        System.out.println("animal is eating...");
    }
}

class Dog extends Aniaml {
    public void eat(){
        System.out.println("Dog is eating...");
    }
}

class BabyDog1 extends Dog{
    public void eat(){
        System.out.println("BabyDog1 is eating...");
    }
}

public class KT_DH {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Aniaml a = new BabyDog1(); //tinh da hinh
        a.eat();
    }
}