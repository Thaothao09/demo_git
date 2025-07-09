package BTJava;
import java.util.Scanner;
public class BT2Lv1 {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        // Trường hợp không có giá trị lớn thứ hai (tất cả phần tử giống nhau)
        if (secondMax == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các số nguyên, cách nhau bằng dấu cách:");
        String input = scanner.nextLine();

        // Tách chuỗi thành mảng chuỗi các số
        String[] parts = input.trim().split("\\s+");

        // Kiểm tra nếu ít hơn 2 phần tử
        if (parts.length < 2) {
            System.out.println("Không đủ phần tử để tìm giá trị lớn thứ hai.");
        } else {
            int[] numbers = new int[parts.length];

            // Chuyển từ chuỗi sang số nguyên
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }

            int secondLargest = findSecondLargest(numbers);

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("Không tìm thấy giá trị lớn thứ hai (có thể tất cả phần tử giống nhau).");
            } else {
                System.out.println("Giá trị lớn thứ hai là: " + secondLargest);
            }
        }
    }
}
