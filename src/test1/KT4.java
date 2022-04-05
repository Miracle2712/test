package test1;
import java.util.Scanner;
public class KT4 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];

        //bai 3

        int sum = scanner.nextInt();
        for (int i = 0; i < size; i++) {
        if (mang[i] % 2 == 0) {
        sum = sum + mang[i];
        }
        }
        System.out.println("tổng chẵn các phần tử trong mảng: " + sum);  }
        }