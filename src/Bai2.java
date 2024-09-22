
import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        float dtb = src.nextFloat();
        if( dtb<=10 && dtb >= 8.0)
                System.out.println("Xếp loại: Giỏi");
        else    
            if( dtb >= 7.0)
                System.out.println("Xếp loại: Khá");
            else
                if( dtb >= 5.0)
                     System.out.println("Xếp loại: Trung bình");
                else
                    System.out.println("Xếp loại: Yếu");          
    }
}
