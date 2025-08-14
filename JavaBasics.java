import java.util.*;
import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        // System.out.println((3<2) || (5>0));
        //Print sum of N natural Numbers
        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i=1;
        // while(i<=n){
        //     sum +=i;
        //     i++;
        // }
        // System.out.println("sum is : "+ sum);

        //Print square pattern
        // for(int line =1; line<=4; line++){
        //     System.out.println("****");
        // }
    //    int line=1;
    //     while(line<=4){
    //         System.out.println("****");
    //         line++;
    //     }

    //Print a reverse Number
    int n=10899;

    while(n>0){
      int lastDigit = n%10;
      System.out.print(lastDigit + " ");
      n = n/10;
    }
    System.out.println();
    }
}