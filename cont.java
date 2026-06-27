public class cont {
    

    public static void main(String[] args) {
        
        int count=0;

        int num = 12345678;

        while(num!=0)
        {
            num= num/10;
            count++;
        }
        System.out.println("Count :"+count);
    }
}
