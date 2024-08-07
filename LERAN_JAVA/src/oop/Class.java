package oop;

public class Class {

    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Object ob1 = new Object(); // constructor
        Object ob2 = new Object("Nghia", 22);
        ob2.setName("PhamNghia");
        System.out.println("check obj = " + ob2.getName() + " and age = " + ob2.getAge());
    }
}
