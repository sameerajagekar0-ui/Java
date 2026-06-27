public class DigitSum{

    public static void main(String[] args) {
        
        int count =0;
        int num=12345678;
        int sum = 0;
        while(num!=0)
        {
            int digit=num%10;
            sum = sum +digit;
            num = num/10;
        }
        System.out.println("Sum ="+sum);
    }
}