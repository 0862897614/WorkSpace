package arrayList;

import java.util.ArrayList;

import bt_OOP.Product;

public class Test {
    public static void main(String[] args) {
        
        ArrayList a1 = new ArrayList();
        a1.add(2); // autoBoxing (tự động converst) : integer (dữ liệu nguyên thủy: int) => Integer (đối tượng)
        a1.add("PhamNghia");

        System.out.println(" Mang: " + a1.toString());

        ArrayList<Product> a2 = new ArrayList(); //lưu dưới dạng Object, java Diamond

        ArrayList<String> a3 = new ArrayList<String>(); // generic: ép kiểu string, integer,...
        a3.add("PhamNghia 1");
        a3.add("PhamNghia 2");
        a3.add("PhamNghia 3");
        a3.remove(1); // xóa 1 phần tử theo chỉ số
        a3.clear(); //xóa tất cả

        System.out.println(" Mang: " + a3.toString() + " - " +  a3.size());   // size: độ dài mảng
        System.out.println(" Mang: " + a3.toString() + " Phan tu dau: " + a3.get(0));  // get: lấy ra vị trí phần tử

    }
    
}
