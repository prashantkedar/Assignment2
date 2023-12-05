import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter length of 1st side= ");
        double a = sc.nextDouble();
	System.out.print("Enter length of 2nd side= ");
        double b = sc.nextDouble();

	double hypo = Math.hypot(a , b);
	
	System.out.printf("Hypotenuse = %.5f" , + hypo);

    }

}