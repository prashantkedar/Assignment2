import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the principal amount : ");
        double p = sc.nextDouble();
	System.out.print("Interest rate : ");
        double b = sc.nextDouble();
	System.out.print("Time period: ");
        double n = sc.nextDouble();

	double A = p*(Math.pow((1+b/100), n));
	
	System.out.printf("output = %.2f" , + A);
	
	

    }

}