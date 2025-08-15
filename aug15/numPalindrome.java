package aug15;
import java.util.*;

public class numPalindrome {
    // A number is called plaindrome if the number is equal to the reverse of a number eg. 121 is plaindrome but 132 is not


    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    int palindrome = sc.nextInt();
    if(plalindrome(palindrome)){
        System.out.println("Number :"+ palindrome +"is a palindrome");
    } else {
        System.out.println("NUmber :"+palindrome + " is not a palindrome");
    }

    }
   
    public static boolean plalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while(palindrome !=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if(num == reverse){
            return true;
        }
           return false;
        
    }
}
