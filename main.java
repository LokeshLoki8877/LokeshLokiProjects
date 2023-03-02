import java.util.*;

public class main{

	public static void main(String[] args) {

		Scanner jk = new Scanner(System.in);
		
		char op;
		int a,b;

		System.out.println("enter the operators + - / *: ");
		op = jk.next().charAt(0);

		System.out.println("enter the first number:");
		a = jk.nextInt();

		System.out.println("enter the second number:");
		b = jk.nextInt();

		switch(op){

		case '+':
			System.out.println("the addition of two numbers is: " + (a+b));
			break;
		case '-':
			System.out.println("the subtraction of two numbers is: " + (a-b));
			break;
		case '/':
			System.out.println("the division of two numbers is: " + (a/b));
			break;
		case '*':
			System.out.println("the multiplication of two numbers is: " + (a*b));
			break;
		default:
			System.out.println("you have enterd a wrong charecters...!!!!!");

	
		}

		jk.close();
	}
}