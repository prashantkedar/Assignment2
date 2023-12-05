import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input 1st Number : ");
        int a = sc.nextInt();
	System.out.print("Input 2nd Number : ");
        int b = sc.nextInt();
	System.out.print("Enter the operation to be performed (+,-,/,*) : ");
        char operator = sc.next().charAt(0);

	if(operator=='+') {
	System.out.print("Result : " + a + operator + b + "=" + (a+b));
	}

	if(operator=='-') {
	System.out.print("Result : " + a + operator + b + "=" + (a-b));
	}

	if(operator=='*') {
	System.out.print("Result : " + a + operator + b + "=" + (a*b));
	}

	if(operator=='/') {
	System.out.print("Result : " + a + operator + b + "=" + (a/b));
	}
	
	

    }

}