package BTJava;

import java.util.Scanner;

public class BT5Lv1 {
    public static String getFirstLetter(String input) {
        String[] words = input.trim().split("\\s+");
        //kiểm tra rỗng
        if (input.trim().isEmpty()) {
            return ""; //trả về chuỗi rỗng nếu ko có nội dung
        }
        String result = "";
        //word = ["","","",...]
        for (String word : words) {
            result += word.charAt(0) + " "; // lấy ký tự đầu của chuỗi và thêm khoảng cách
        }
        return result.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần tách: ");
        String input = scanner.nextLine();

        String result = getFirstLetter(input);

        System.out.println("Kết quả: " + result);
    }
}
