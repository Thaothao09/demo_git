//viết chương trình tính tiền lương
//cho phép người dùng nhập số ngày làm
//và số tiền 1 ngày
//tổng lương = số ngày làm * số tiền 1 ngày
//lưu ý tách hàm ra xử lý
package org.example;

import java.util.Scanner;

public class tienLuongtachham {
    static int tinhTongLuong(int tongNgay, int luong1Ngay) {
        int tongLuong = tongNgay * luong1Ngay;
        return tongLuong;}
        public static void main(String[] args){

    //mô hình IPO
//input
//giá trị từ phía người dùng nhập
//tổng số giờ làm, số lương 1 giờ
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số ngày làm");
    int tongNgay = scanner.nextInt();
    System.out.println("Nhập số lương 1 ngày");
    int luong1Ngay = scanner.nextInt();
    //process
//giá trị từ người dùng nhập đi thực hiện logic yêu cầu của bài toán
//tongLuong = tổng số giờ làm * số lương 1 giờ
    int tongLuong = tinhTongLuong(tongNgay, luong1Ngay);
//output
//giá trị đầu ra từ yêu cầu của đề
//sout("...")
System.out.println(tongLuong);

            System.out.println("Hello world");
}
}