package BTJava;
import java.util.Scanner;
public class BT3Lv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for (int k = 0; k <= n; k+=2) {
            tong += k;
        }
        System.out.println("Tổng số chẵn từ 0 tới n = " + tong);
    }
}
