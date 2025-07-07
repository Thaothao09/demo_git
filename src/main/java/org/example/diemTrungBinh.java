package org.example;

import java.util.Scanner;

public class diemTrungBinh {
    //Yêu cầu: viết chương trình cho phép người dùng nhập vào điểm toán
    //lý hóa tính điểm trung bình và in ra màn hình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        float toan = scanner.nextFloat();
        System.out.println("Nhập điểm lý: ");
        float ly = scanner.nextFloat();
        System.out.println("Nhập điểm hóa: ");
        float hoa = scanner.nextFloat();
        float trungbinh = (toan + ly + hoa) / 3;
        System.out.println("Điểm trung bình là " + trungbinh);
    }
}
