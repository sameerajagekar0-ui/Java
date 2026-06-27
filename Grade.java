
import java.util.Scanner;

public class Grade {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks :");
        double x = sc.nextDouble();

        if (x>75)
        {
            System.out.println("Pass With Distinction");
        }
        else if(x>65&&x<75)
        {
            System.out.println("First Class");
        }
        else if(x>55&&x<65)
        {
                System.out.println("Second Class");
        }
        else if(x>34&&x<55)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }

}
