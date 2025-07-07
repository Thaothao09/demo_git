package org.example;

import java.util.Scanner;

public class TinhLuong {
    //Yêu cầu: viết chương trình tính lương cho phép người dùng nhập
    //vào tên, lương 1 ngày, tổng số ngày làm và in kết quả màn hình
    //ví dụ lương 1 ngày là 10d làm 28 = 280d
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ô nhập tên
        System.out.println("Nhập tên nhân viên: ");
        String tennv = scanner.nextLine();
        //ô nhập lương 1 ngày
        System.out.println("Lương 1 ngày: ");
        int luong1ngay = scanner.nextInt();
        //ô nhập số ngày làm
        System.out.println("Số ngày làm việc: ");
        int songay = scanner.nextInt();
        int tongluong = luong1ngay * songay;
        System.out.println("Lương 1 ngày làm là " + luong1ngay + " Đồng " + "Làm " + songay + "=> " + tongluong + " Đồng");
    }
}
