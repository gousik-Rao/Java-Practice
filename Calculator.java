package pack.Practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] ar) {
		Scanner s = new Scanner(System.in);
		Calculator calc = new Calculator(); // default constructor
		
		while(true) {
			
		System.out.print("Enter operator: ");
		char op = s.next().trim().charAt(0);
		
		if(op == '+' || op == '-' || op == '*' || op == '/' 
				|| op == '%') {
			System.out.print("Enter numbers: ");
			long num1 = s.nextInt();
			long num2 = s.nextInt();
			if(op == '+') {
				System.out.println("Result: "+ (num1 + num2)+"\n");
			}
			else if(op == '-') {
				System.out.println("Result: "+ (num1 - num2)+"\n");
			}
			else if(op == '*') {
				System.out.println("Result: "+ (num1 * num2)+"\n");
			}
			else if(op == '/') {
				double div = (num1 / num2);
				System.out.println("Result: "+ div +"\n");
			}
			else if(op == '%') {
				if(num2 == 0) {
					throw new ArithmeticException("Divide by 0 is not possible");
				}else {
					double expo = (num1 % num2);

					System.out.println("Result: "+ expo +"\n");
				}
			}
		}
		else if(op == 'x' || op == 'X') {
			System.out.println("Program ends");
			break;
		}
		else {
			System.out.println("Enter valid Operator !\n");
		}
		
		}

	}
	
	public void calculation() {
		
	}
	
}
