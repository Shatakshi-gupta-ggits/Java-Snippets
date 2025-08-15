import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("n is Prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        primesInRange(n);
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
