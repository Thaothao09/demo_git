package BTJava;
import java.util.Scanner;
public class BT4Lv1 {
    public static int wordCount(String input){
        //xóa khoảng trắng đầu và cuối chuỗi sau đó tách chuỗi thành từng mảng từ
        String[] word = input.trim().split("\\s+");
        //kiểm tra rỗng
        if(input.trim().isEmpty()){
            return 0;
        }
        return word.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần đếm: ");
        String input = scanner.nextLine();

        int wordCount=wordCount(input);
        System.out.println("Số từ trong chuỗi: " + wordCount);
    }
}
