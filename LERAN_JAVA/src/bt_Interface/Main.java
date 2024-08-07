package bt_Interface;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("123", "PhamNghia", 22, 3);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person pr1 = new Person("123", "Nghia", 22);
        System.out.println(pr1);
    }
}
