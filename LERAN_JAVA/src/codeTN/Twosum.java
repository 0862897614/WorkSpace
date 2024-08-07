package codeTN;

import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so lung phan tu: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size ; ++i) {
            System.out.print("Nhap phan tu :" );
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < size; ++i){
            for (int j = i+1; j < size; ++j){
                if (arr[i] + arr[j] == n){
                    System.out.print("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }
}
