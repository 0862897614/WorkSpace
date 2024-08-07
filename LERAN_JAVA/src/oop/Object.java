package oop;

public class Object {

    // class attributes
    private String name;
    private int age;

    // constructor
    public Object() {
 
    } 
    public Object(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {  // lấy giá trị
        return name;
    }
    public void setName(String name) {  // gán giá trị
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 



}
