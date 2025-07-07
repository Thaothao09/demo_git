package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //câu lệnh If
        //if(điều kiện){thực hiện logic}
        //điều kiện đúng
        if(9>2){
            System.out.println("điều kiện đúng");
        }
        //điều kiện sai
        if (2>9){
            System.out.println("điều kiện sai");
        }
        //viết chương trình kiểm tra xem hôm nay có phải ngày đi học ko
        int day = 4;
        if(day == 4 || day == 8){
            System.out.println("Hôm nay đi học");
        }

        //câu if.. else
        //if(điều kiện){thực hiện logic1} else {thực hiện logic2}

        int a =8;
        int b =10;
        if(a>b) {
            System.out.println("số a lớn hơn số b");
        }else {
            System.out.println("số b lớn hơn số a");
        };

        //yêu cầu: viết chương trình cho phép người dùng nhập vào số tuổi,
        // kiểm tra xem đã đủ tuổi học đại học chưa

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tuổi: ");
        int age = scanner.nextInt();

 //       if(age > 18) {
 //           System.out.println("Bạn đủ tuổi học đại học");
 //       }else {
 //           System.out.println("Bạn chưa đủ tuổi học đại học");
 //       }
 //    }

        //toán tử 3 ngôi ->điều kiện ? thực hiện logic 1: thực hiện logic 2
        String result = (age >18) ? "Bạn đủ tuổi học đại học" : "Bạn chưa đủ tuổi học đại học";
        System.out.println(result);

        //if(điều kiện 1){thực hiện logic1}
        // else if(điều kiện 2){thực hiện logic2}
        //else {thực hiện logic3}

        int c =8;
        if(c == 10) {
            System.out.println("số 10");
        } else if (c==11) {
            System.out.println("Số 11");
        } else if (c==12) {
            System.out.println("Số 12");
        } else {
            System.out.println("Vui lòng nhập lại số");
        }

        //Viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán,
        //lý, hóa, sau đó tính điểm trung bình
        //nếu điểm trung bình < 5 học sinh yếu
        //5.1-6: trug bình
        //6.1-7: khá
        //7.1-8: giỏi
        //8.1-10: xuất sắc

        System.out.println("Nhập điểm toán: ");
        float toan = scanner.nextInt();

        System.out.println("Nhập điểm lý: ");
        float ly = scanner.nextInt();

        System.out.println("Nhập điểm hóa: ");
        float hoa = scanner.nextInt();

        float diemtrungbinh = (toan + ly + hoa) / 3;
        System.out.println("Điểm trung bình là " + diemtrungbinh);

        if(0< diemtrungbinh && diemtrungbinh <=5) {
            System.out.println("Học sinh yếu");
        } else if (5.1<=diemtrungbinh && diemtrungbinh <=6) {
            System.out.println("Học sinh trung bình");
        } else if (6.1<=diemtrungbinh && diemtrungbinh <=7) {
            System.out.println("Học sinh khá");
        } else if (7.1<=diemtrungbinh && diemtrungbinh <=8) {
            System.out.println("Học sinh giỏi");
        } else if (8<=diemtrungbinh && diemtrungbinh <=10) {
            System.out.println("Học sinh xuất sắc");
        } else {System.out.println("Vui lòng nhập lại");
        }


    }
}