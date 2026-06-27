
import java.util.Scanner;

public class Div {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number :");
        int a = sc.nextInt();

        if(a%5==0 && a%11==0)
        {
            System.out.println("Number Is divisible by 5 and 11");
        }
        else{
            System.out.println("Number is Not Divisible by 5 and 11");
        }
        sc.close();
    }
}
