import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Value:");
        int x = sc.nextInt();

        double square = x*x;

        System.out.println("Squre is :"+square);
    }
}
