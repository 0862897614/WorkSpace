package try_catch;

import java.util.Scanner;

public class trycatchfll_ {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // try {
        //     int x = scanner.nextInt();
        //     System.out.println("run try");
        // } 
        // catch (Exception e) {
        //     System.out.println("run catch");
        //     // TODO: handle exception
        // } 
        // finally { 
        //     System.out.println("run finally");
        //     scanner.close();
        //     // TODO: handle finally exception
        // }
        
        //cach 2: try_finally
        try(Scanner scanner = new Scanner(System.in)){
            int x = scanner.nextInt();
        }
    }
}
