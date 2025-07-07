package org.example;
import java.util.Scanner;
public class BienCodeUni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thực thứ nhất");
        String value1 = scan.nextLine();
        System.out.println("Nhập số thực thứ hai");
        String value2 = scan.nextLine();

        Float num1 = Float.parseFloat(value1);
        Float num2 = Float.parseFloat(value2);
        Float tong = num1 + num2;
        System.out.println("Tổng là: "+tong);
    }
}
