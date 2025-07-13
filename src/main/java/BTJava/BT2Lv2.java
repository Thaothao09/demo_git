package BTJava;
import java.util.Scanner;
public class BT2Lv2 {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        if (isPalindrome(chuoi)) {
            System.out.println("Chuỗi là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
        }
    }
}
