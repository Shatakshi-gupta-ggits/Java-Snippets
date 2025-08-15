package aug15;
import java.util.*;
public class sumofDigits {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Integr : ");
        int digits= sc.nextInt();
        System.out.println("The sum is: "+ sumDigits(digits));

    }
    public static int sumDigits(int n){
        int sumOfDigits =0;
        while(n>0){
            int lastDigit = n % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            n = n / 10;
        }
        return sumOfDigits;
    }
}
