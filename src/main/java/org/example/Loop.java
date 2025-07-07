package org.example;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vòng lặp while
        //giá trị ban đầu
        //white(điều kiện) {
        // thực hiện logic

        //thay đổi giá trị ban đầu

        //yêu cầu: in ra 5 dòng hello world
        int o = 2;
        while (o <= 5) {
            System.out.println("Hello world");
            o++;    //o = o +1 hoặc o+=1
        }
        System.out.println("Nhập vô số lần hiển thị text: ");
        int b = scanner.nextInt();
        while (b > 0) {
            System.out.println("Hello Testing 05");
            b--;
        }

        //vòng lặp while
        //gía trị ban đầu
        //        do {
        //           thực hiện logic

        //           lần thay đổi giá trị ban đầu
        //       }while(điều kiện)


        int index = 1;
        do {
            System.out.println("Giá trị i: " + index);
            index++;
        } while (index <= 5);


        //vòng lặp for
        //for (giá trị khởi tạo; điều kiện; cập nhật giá trị khởi tạo)
        for (int j = 1; j <= 5; j++) {
            System.out.println("Giá trị j: " + j);
        }


        //bài tập 1: viết chương trình cho phép người dùng nhập vào số a
        //tính tổng số từ 1 đến a

        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for (int k = 0; k <= n; k++) {
            tong += k;
        }
        System.out.println("Tổng c = " + tong);

        //bài tập 2: viết chương trình cho phép người dùng nhập vào số n.
        //Tính tổng số chẵn từ 0 đến n

        System.out.println("Nhập vào số n: ");
        int n2 = scanner.nextInt();
        //tổng chẵn, tổng lẻ thì k bắt đầu bằng số 1
        int tong2 = 0;
        for (int k = 0; k <= n2; k += 2) {
            if (k % 2 == 0) {
                tong2 += k;
            }
        }
        System.out.println("tổng n = " + tong2);

// chia hết cho 3

        System.out.println("Nhập vào số cần chia hết cho 3: ");
        int n3 = scanner.nextInt();
        int tong3 = 0;
        for (int k = 3; k <= n3; k += 3) {
            if (k % 3 == 0) {
                tong3 += k;
            }
        }
        System.out.println("tổng n3 = " + tong3);
    }
}


