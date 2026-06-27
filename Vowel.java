import java.util.Scanner;

public class Vowel{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character :");
        char ch = sc.next().charAt(0);

        if(Character.isLowerCase(ch))
        {
            char Lowerch = Character.toLowerCase(ch);

            if(Lowerch=='a'||Lowerch=='e'||Lowerch=='i'||Lowerch=='o'||Lowerch=='u')
            {
                System.out.println("Vowel");
            }
            else{
                System.out.println("Not A Vowel ");
            }
        } 
        else{
                System.out.println("Not A Character");
        }      
        


    }
}