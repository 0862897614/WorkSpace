package bt;
import java.util.Arrays;
import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array ban dau: " + Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("Array sap xep: "+ Arrays.toString(arr));
        // System.out.println("max = " + arr[arr.length-1]);
        // System.out.println("min = " + arr[0]);

        int max = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            // if (arr[i] > max){
            // max = arr[i];
            // }
            max = Math.max(max, arr[i]);
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            // if (arr[i] < min){
            // min = arr[i];
            // }
            min = Math.min(min, arr[i]);
        }

        System.out.println("Max la: " + max);
        System.out.println("Min la: " + min);

    }

}
