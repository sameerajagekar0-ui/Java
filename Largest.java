import java.util.Scanner;

public class Largest {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    

        System.out.println("Enter First Number :");
        int x = sc.nextInt();
        
        System.out.println("Enter Second Number :");
        int y = sc.nextInt();

        if(x>y)
        {
            System.out.println("largest Number is "+x);
        }
        else if(y>x){
            System.out.println("Largest Number is "+y);
        }
        else{
            System.out.print("Both are Equal");
        }
        sc.close();
    }
}
