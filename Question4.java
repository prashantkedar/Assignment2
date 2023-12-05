import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a five-digit number = ");
        int a = sc.nextInt();
	
	int b = a/10000;
	int c = a%100;
	int d = c/10;

	System.out.println(b + d);
	

    }

}