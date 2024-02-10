
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double  u, alan;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci kenari giriniz : ");
        a = scanner.nextInt();
        System.out.print("Ikinci kenari giriniz : ");
        b = scanner.nextInt();
        System.out.print("Ucuncu kenari giriniz :");
        c = scanner.nextInt();
        
        u = (a + b + c) / 2;
        
        alan = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
        
        System.out.println("Alan : " + alan);
        
    }
}
