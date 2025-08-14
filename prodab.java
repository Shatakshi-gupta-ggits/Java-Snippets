package aug14;
import java.util.*;
public class prodab {

            public static int multiply(int n, int m){
        int product = n*m;
        return product;
    }
    public static void main(String args[]){
        System.out.println("Enter value of a and b :");
      Scanner a = new Scanner(System.in);
      Scanner b= new Scanner(System.in);

      int n =  a.nextInt();
      int m= b.nextInt();

      int prod = multiply(n,m);
      System.out.println(prod);
    }
    
}
