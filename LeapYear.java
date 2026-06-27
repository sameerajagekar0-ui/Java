import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Year :");
        double x = sc.nextDouble();

        if(x%4==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
