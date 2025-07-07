package org.example;

public class ToanTu {
    public static void main(String[] args) {
        // cộng trừ nhân chia
        int a = 10;
        int b = 15;

        //tổng
        int sum = a + b;
        //hiệu
        int minus = a - b;
        // tích
        int multiply = a * b;
        //thương
        int divided = a / b;
        // chia lấy dư
        int layphandu = a % b;

        System.out.println("Tổng "+sum);
        System.out.println("Hiệu "+minus);
        System.out.println("Tích "+multiply);
        System.out.println("Thương "+ divided);
        System.out.println("Lấy phần dư "+layphandu);

        //tiền tố: cộng thêm 1 đơn vị vào dòng tiền tố
        System.out.println(++a);
        //hậu tố: cộng thêm 1 đơn vị vào dòng sau dòng hậu tố
        int c = 10;
        int d = 20;
        System.out.println(d++);
        System.out.println(d);

        //toán tử so sánh
        // so sánh giá trị ( == )
        int e = 10;
        int f = 10;
        boolean sosanh = e == f;
        System.out.println(sosanh);

        // so sánh không bằng ( != )
        boolean sosanhkobang = e != f;
        System.out.println(sosanhkobang);

        //toán tử logic
        //and (&&)
        boolean rs1 = (10 == 10) && (15 == 15);
        System.out.println(rs1);

        // or (||)
        boolean rs2 = (10 == 15) || (15 == 15) || (10 == 8);
        System.out.println(rs2);

        // phủ định: !
        boolean rs3 = !(2>1);
        System.out.println(rs3);
    }
}
