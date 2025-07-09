package BTJava;

import java.util.Scanner;

public class BT1Lv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char lowerCh = Character.toLowerCase(ch);

            // Kiểm tra nếu không phải nguyên âm thì thêm vào kết quả
            if (lowerCh != 'a' && lowerCh != 'e' && lowerCh != 'i' && lowerCh != 'o' && lowerCh != 'u') {
                result += ch;
            }
        }

        // In kết quả
        System.out.println("Chuỗi sau khi xóa nguyên âm: " + result);
    }

}
