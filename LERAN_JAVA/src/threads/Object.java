package threads;

public class Object extends Thread {

    // Phương thức run() được gọi khi luồng được bắt đầu
    public void run() {
        System.out.println("Start thread");
        long sum = 0L;
        for (long i = 0L; i < 10000000000L; ++i) { 
            sum += i;
        }
        System.out.println("End thread"); 
    }

    public static void main(String[] args) {

        int max = 8; // Số lượng luồng sẽ được khởi tạo
        for (int i = 0; i < max; ++i) {
            (new Object()).start(); // Tạo và bắt đầu một đối tượng Object là một luồng mới
        }
        
        System.out.println("Finish"); // In ra khi tất cả các luồng đã được bắt đầu
    }
    
}
