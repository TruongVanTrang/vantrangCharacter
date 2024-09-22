
import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        float a, b, c;
        double x1, x2;
        System.out.println("Nhập giá trị a, b, c: ");
        a = src.nextFloat();
        b = src.nextFloat();
        c = src.nextFloat();
        if( a==0 )
           if( b==0)
                if(c==0)
                    System.out.println("Phương trình vô số nghiệm.");
                else    
                    System.out.println("Phương trình vô nghiệm.");
           else
           {
               x1 = -c/b;
               System.out.println("Phương trình có 1 nghiệm: " + x1);
           }
        else
        {
            double D = (b*b - 4*a*c);
            if( D > 0)
            {
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("Phương trình có 2 nghiệm: "+ x1 + " va " + x2);
            }
            else    
                if( D==0)
                {
                    x1 = -b/(2*a);
                    System.out.println("Phương trình có nghiệm kép: " + x1);
                }
            else
                    System.out.println("Phương trình vô nghiệm");
        }             
    }
}
