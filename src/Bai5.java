
import java.util.Scanner;


public class Bai5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào 3 giá trị độ dài: ");;
        float a = src.nextFloat();
        float b = src.nextFloat();
        float c = src.nextFloat();
        if( a+b > c && a+c > b && b+c > a)
        {
            System.out.println("Tạo đươc một tam giác: ");
            if( a==b && a==c)
                System.out.println("Tam giác đều.");
            else    
                if(a==b || b==c || a==c)
                    System.out.println("Tam giác cân."); 
                else
                    if( a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
                        System.out.println("Tam giác vuông");
                    else
                        System.out.println("Tam giác thường.");
            }
        else    
            System.out.println("Không thỏa đk để tạo một tam giác.");
    }
}
