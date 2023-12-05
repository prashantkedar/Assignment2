import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Base = ");
        double a = sc.nextDouble();
	System.out.print("Exponent = ");
        double b = sc.nextDouble();
	
	System.out.println ("Result = " + Math.pow(a , b));
	

	

    }

}