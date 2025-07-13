package BTJava;
import java.util.Scanner;
public class BT3Lv2 {
    public static String xoaKyTuLap(String str) {
        String ketQua = "";

        for (int i = 0; i < str.length(); i++) {
            char kyTu = str.charAt(i);
            if (ketQua.indexOf(kyTu) == -1) {
                ketQua += kyTu;
            }
        }

        return ketQua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String chuoiNhap = scanner.nextLine();

        // Gọi hàm xử lý
        String chuoiKetQua = xoaKyTuLap(chuoiNhap);

        // In kết quả
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + chuoiKetQua);
    }
}
