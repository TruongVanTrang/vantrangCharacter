
import java.util.Scanner;


public class Bai4 {
    public static void main(String[] args) {
        Scanner src = new Scanner( System.in);
        System.out.println("Hãy nhập 3 số bất kì: ");
        long a = src.nextLong();
        long b = src.nextLong();
        long c = src.nextLong();
        long min = a;
        if( b < min )
            min = b;
        else
            if( c < min )
                min = c ;
        System.out.println("Số nhỏ nhất là: " + min);              
    }
}