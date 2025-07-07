//viết chương trình nhập vào thông tin tiêu thụ điện (tên, số kw)
//Tính và xuất tiền trả theo quy tắc
//50kw đầu: 500d/kw
//50kw kế: 650/kw
//100kw kế: 850d/kw
//150kw kế: 1100d/kw
//còn lại: 1300d/kw

package org.example;
import java.util.Scanner;
public class TienDien {

    public static void main(String[] args) {
        //      Scanner scanner = new Scanner(System.in);
        //       System.out.println("Tên: ");
//        String ten = scanner.nextLine();

        //    System.out.println("Số KW: ");
        //      int kw = scanner.nextInt();

//        int tienDien = 0;

        //  if (0 < kw && kw <= 50) {
        //       tienDien = kw * 500;
        //    } else if (50 < kw && kw <= 100) {
        //       tienDien = 50 * 500 + (kw - 50) * 650;
        //   } else if (100 < kw && kw <= 200) {
        //        tienDien = 50 * 500 + 50 * 650 + (kw - 100) * 850;
        //     } else if (200 < kw && kw <= 350) {
        //        tienDien = 50 * 500 + 50 * 650 + 100 * 850 + (kw - 200) * 1100;
        //  } else if (350 < kw) {
        //       tienDien = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (kw - 350) * 1300;
        //    } else {
        //         System.out.println("Vui lòng nhập lại");
        //    }
        //      System.out.println("Khách hàng " + ten + " có tiền điện cần đóng là :" + tienDien);
        //  }
//}

//switch case
//    switch (giá trị đem đi so sánh){
//        case giá trị so sánh
//                thực hiện logic
//                break

        int d = 15;
        switch (d) {
            case 5:
                System.out.println("số 5");
                break;
            case 10:
                System.out.println("Số 10");
                break;
            default:
                System.out.println("Vui lòng kiểm tra lại");
        }
    }
}
//lưu ý: nên switch case - giá so sánh là giá trị cụ thể, điều kiện đơn giản