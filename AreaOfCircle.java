
import java.util.Scanner;

public class AreaOfCircle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radious Of Circle:");
        Double r = sc.nextDouble();
        double pi = 3.14;
        double Area = pi*r*r;
        System.out.println("Area Of Circle :"+Area);
    }
}
