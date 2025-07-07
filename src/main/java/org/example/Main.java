package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //khởi tạo lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //biến - nơi lưu trữ dữ liệu
        // <kiểu dữ liệu> <tên biến> = <giá trị khởi tạo>

     //Quy tắc đặt tên biến
     // Bắt buộc bắt đầu bằng chữ cái, không được bắt đầu bằng số, không được viết có dấu tiếng Việt
     // Không được đặt trùng với từ khóa của java (public, class, void, static, ...)
     // Đặt tên theo quy tắc camel case => hoTen, tongLuong

        //kiểu dữ liệu dạng primative value: byte, short, int, long, float, char, boolean, double, ...
        // kiểu dữ liệu tham chiếu: string, array, class, object và interface

        int age = 18;
        double salary = 1500.15;
        //char = 'Nguyet';
        boolean isLogin = true; //false

        //hằng số - giá trị không đổi
        final double pi = 3.14159;

        //yêu cầu 1: cho phép người dùng vào tên mình và xuất ra màn hình

        //ô nhập
        System.out.println("Nhập tên người dùng: ");
        //Nhận giá trị từ người dùng
        String name = scanner.nextLine();
        // lệnh xuất ra màn hình
        System.out.println("Xin chào " + name);

        //yêu cầu 2: viết chương trình cho sinh viên nhập vào tên, lớp, tuổi (scanner.nextInt()) và in ra màn hình
        System.out.println("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        System.out.println("Xin chào " + ten + " hiện đang học lớp " + lop + " "+ tuoi + " tuổi");
        }
    }