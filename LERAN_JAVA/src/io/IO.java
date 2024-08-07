package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException   {
        // Khai báo biến FileInputStream và FileOutputStream để đọc và ghi file
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            
            // Mở FileInputStream để đọc file input.txt
            // in = new FileInputStream("./src/io/input.txt"); // relative path ..
            // Đường dẫn tuyệt đối đến file input.txt
            in = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\LERAN_JAVA\\src\\io\\input.txt"); //absolute
            
            // Mở FileOutputStream để ghi dữ liệu vào file output.txt
            // Đường dẫn tương đối, file output.txt sẽ được tạo trong thư mục làm việc hiện tại
            out = new FileOutputStream("output.txt"); // relative path..
            
            int c;
            // Đọc byte từ file input.txt và ghi vào file output.txt
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally { // Đảm bảo đóng FileInputStream và FileOutputStream sau khi sử dụng

            // Đóng FileInputStream
            if (in != null) {
                in.close();
            }
            // Đóng FileOutputStream
            if (out != null) {
                out.close();
            }
            // In ra dòng thông báo khi kết thúc chương trình
            System.out.println("END");
        }
    }
}
