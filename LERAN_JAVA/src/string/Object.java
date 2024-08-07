package string;

import java.util.ArrayList;

public class Object {
    public static void main(String[] args) {
        Student st1 = new Student("Pham Nghia 1" , 1);
        Student st2 = new Student("Van Nghia 2" , 2);
        Student st3 = new Student("Tien Nghia 3" , 3);
        Student st4 = new Student("Phan Nghia 4" , 4);
        Student st5 = new Student("Pham Nghia 5" , 5);
        
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);

        for (int i = 0; i < arr.size(); ++i ){
            if (arr.get(i).getName().startsWith("Pham")) {
                System.out.println("start with Pham: " + arr.get(i));
            }
        }

        System.out.println("Check arr = " + arr);
    }
}