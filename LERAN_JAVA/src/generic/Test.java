package generic;

public class Test {
    public static void main(String[] args) {
        printer(123);
        printer("Hello Pham Nghia");
    }

    public static <T> void printer (T value){ // T là kiểu dữ liệu giữ chỗ cho kiểu dữ liệu truyền vào
        System.out.println(value);
    }
}