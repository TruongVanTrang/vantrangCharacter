
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int x = src.nextInt();
        if( x > 0)
            System.out.println(x +" Là số dương");
        else    
            if( x < 0)
                System.out.println(x + " Là số âm");
            else
                System.out.println("Là số 0");
    }
 
}
