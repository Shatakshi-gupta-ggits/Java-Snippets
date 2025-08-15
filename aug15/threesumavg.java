package aug15;
import java.util.*;


public class threesumavg {
	public static void main(String[] args) {
		//to compute the avg of three numbers
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the first number: ");
		double x = sc.nextDouble();
		System.out.println("Input the Second number: ");
		double y = sc.nextDouble();
		System.out.println("Input the third number : ");
		double z = sc.nextDouble();
		
		System.out.print("The avg value is "+ avg(x, y, z)+" \n");
	}
	public static double avg(double x, double y, double z){
	    return(x+y+ z) /3;
	}
}
    