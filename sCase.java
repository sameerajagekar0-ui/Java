
import java.util.Scanner;

public class sCase {
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character:");
        char ch = sc.next().charAt(0);

        if(Character.isLowerCase(ch))
        {
            System.out.println("Lower Case");
        }
        else if(Character.isUpperCase(ch))
        {
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Not a Character");
        }
        sc.close();
    }
}
