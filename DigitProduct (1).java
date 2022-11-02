import java.util.Scanner;
public class DigitProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int num, rem;
        int product = 1;
        System.out.print("Enter any number : ");
        num = scanner.nextInt();
        
        while(num != 0) {
           
            rem=num%10;
            product=product*rem;
            num= num / 10;
        }
             System.out.println(product);
    }

}