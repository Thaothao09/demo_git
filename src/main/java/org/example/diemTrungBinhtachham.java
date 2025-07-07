package org.example;

import java.util.Scanner;

public class diemTrungBinhtachham {
    static float diemtrungbinh(float toan, float ly, float hoa) {
        float trungbinh = (hoa + toan + ly) / 3;
        return trungbinh;
    }

    static String xepLoai(float trungbinh) {
        String result = "";
        if (0 < trungbinh && trungbinh <= 5) {
            result = "Học sinh yếu";
        } else if (5.1 <= trungbinh && trungbinh <= 6) {
            result = "Học sinh trung bình";
        } else if (6.1 <= trungbinh && trungbinh <= 7) {
            result = "Học sinh khá";
        } else if (7.1 <= trungbinh && trungbinh <= 8) {
            result = "Học sinh giỏi";
        } else if (8.1 <= trungbinh && trungbinh <= 10) {
            result = "Học sinh xuất sắc";
        } else {
            result = "Vui lòng nhập lại";}
            return result;
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập điểm toán: ");
            float toan = scanner.nextFloat();
            System.out.println("Nhập điểm lý: ");
            float ly = scanner.nextFloat();
            System.out.println("Nhập điểm hóa: ");
            float hoa = scanner.nextFloat();
            float trungbinh = diemtrungbinh(toan, ly, hoa);
            String danhGia = xepLoai(trungbinh);
            System.out.println(danhGia);
        }
    }
