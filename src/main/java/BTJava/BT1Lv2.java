package BTJava;
import java.util.Scanner;
public class BT1Lv2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //Nhập thu nhập hàng năm của người dùng
        System.out.println("Nhập thu nhập hàng năm (VND): ");
        double thuNhap = scanner.nextDouble();

        // Khai báo biến để tính số thuế phải trả
        double thuePhaiTra = 0;

        //Tính thuế theo các mức thu nhập
        if (thuNhap <= 5000000) {
            thuePhaiTra = thuNhap * 0.05; // 5% cho thu nhập <= 5 triệu
        } else if (thuNhap <= 10000000) {
            thuePhaiTra = 5000000 * 0.05 + (thuNhap - 5000000) * 0.1; // 5% cho 5 triệu đầu và 10% cho phần còn lại
        } else if (thuNhap <= 18000000) {
            thuePhaiTra = 5000000 * 0.05 + 5000000 * 0.1 + (thuNhap - 10000000) * 0.15; // 5%, 10% và 15% cho phần còn lại
        } else if (thuNhap <= 32000000) {
            thuePhaiTra = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + (thuNhap - 18000000) * 0.2; // 5%, 10%, 15%, 20%
        } else if (thuNhap <= 52000000) {
            thuePhaiTra = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + (thuNhap - 32000000) * 0.25;
        } else if (thuNhap <= 80000000) {
            thuePhaiTra = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + 20000000 * 0.25 + (thuNhap - 52000000) * 0.3;
        } else {
            thuePhaiTra = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + 20000000 * 0.25 + 28000000 * 0.3 + (thuNhap - 80000000) * 0.35;
        }

        // In ra số thuế phải trả
        System.out.println("Số thuế phải trả: " + thuePhaiTra + " VND");
        }
        }
