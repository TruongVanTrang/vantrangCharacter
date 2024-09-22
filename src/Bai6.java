
import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập 2 số bất kì: ");
        int a = src.nextInt();
        int b = src.nextInt();
        src.nextLine();
        System.out.println("Hãy nhập vào một phép toán");
        String pheptoan = src.nextLine();
        switch(pheptoan)
         {
            case "+" : System.out.println("Tổng hai số: " + (a+b)); break;
            case "-" : System.out.println("Hiệu hai số: " + (a-b)); break;
            case "*" : System.out.println("Tích hai số: " + ((long)a*b)); break;
            case "/" : System.out.println("Thương hai số: " + ((double)a/b)); break;
          }
    }
}
