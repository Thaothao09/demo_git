//viết chương trình đánh giá học sinh
//nhập toán lý hóa, tính điểm trung bình và đánh giá
//<=5 hs yếu
//5.1 - 6: tb
//6.1-7: khá
//7.1-8: giỏi
//8.1-10: xuất sắc
//lưu ý tách hàm tính điểm trung bình
//và tách hàm xếp loại

package org.example;
import java.util.Scanner;
public class BT3 {
    static float diemtrungbinh(float diemToan, float diemLy, float diemHoa){
        float diemtrungbinh=(diemToan+diemLy+diemHoa)/3;
        return diemtrungbinh;}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        float diemToan = scanner.nextInt();
        System.out.println("Nhập điểm lý: ");
        float diemLy = scanner.nextInt();
        System.out.println("Nhập điểm hóa: ");
        float diemHoa = scanner.nextInt();
        float diemtrungbinh = diemtrungbinh(diemToan, diemLy, diemHoa);
        System.out.println("Điểm trung bình là " + diemtrungbinh);

        if (0 < diemtrungbinh && diemtrungbinh <= 5) {
            System.out.println("Học sinh yếu");
        } else if (5.1 <= diemtrungbinh && diemtrungbinh <= 6) {
            System.out.println("Học sinh trung bình");
        } else if (6.1 <= diemtrungbinh && diemtrungbinh <= 7) {
            System.out.println("Học sinh khá");
        } else if (7.1 <= diemtrungbinh && diemtrungbinh <= 8) {
            System.out.println("Học sinh giỏi");
        } else if (8 <= diemtrungbinh && diemtrungbinh <= 10) {
            System.out.println("Học sinh xuất sắc");
        } else {
            System.out.println("Vui lòng nhập lại");
        }

    }
}
