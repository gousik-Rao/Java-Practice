package pack.Practice;
import java.util.Arrays;
import java.util.Scanner;

import pack.Practice.shapes.*;

public class Main extends AbstractClasses{
	public static void main(String[] arg) {
//		Circle.area(5);
//		Square.area(3);
		
//		Configuration instance = Configuration.getInstance("Development");

//		Configuration instance1 = Configuration.getInstance("Running");
//		Configuration instance2 = Configuration.getInstance("Idle");
		
//		
//		System.out.println(instance.getMode());
//		instance.setMode("Pre-Release");
//		Configuration instance2 = Configuration.getInstance("Running");
//		System.out.println("Updated Mode: "+instance2.getMode());
//		instance2.setMode("Testing");
//		Configuration instance3 = Configuration.getInstance("Crash");
//		System.out.println("Second Configuration: "+instance3.getMode());
		
//		Main im = new Main();
//		System.out.println(im.stringBuilder("alpaM"));
		
//		Library lb = new Library("Abdul Kalaam Library");
//		
//		Library.Book b = lb.new Book("The Great Gatsby","F. Scott Fitzgerald");
//		b.getBookDetails();
//		String s = "Navin";
//		String s1 = new String("Navin");
//		System.out.println(s.equals(s1));
		
//		Object obj = 90;
//		System.out.print(obj);
		
//		int s =  90;
//		System.out.println(s);
//		
//		switch (s) {
//		case 10 -> System.out.println("Incorrect");
//		case 20 -> System.out.println("Incorrect");
//		case 30 -> System.out.println("Incorrect");
//		case 40 -> System.out.println("Incorrect");
//		case 90 -> System.out.println("Correct Hurrah!!");
//		case 80 -> System.out.println("Incorrect");
//		case 70 -> System.out.println("Incorrect");
//		default -> System.out.println("Sorry No right answer");
		
		
//		String name  = "Kunal";
//		m.change(name);
//		System.out.println(name);
		
//		System.out.println("Enter a number: ");
//		int n = s.nextInt();

//	    m.change(n);
//		System.out.println(n);
		
//		{
//			 n = 100; // values initialized outside the block can be modified within the block but the same variables cant be reinitialized
//			 int c = 90;
			 // values initialized in this block only have scope within the block
//		}
//		int c = 100;
		
//		System.out.println(n);
//		
//		int[]  arr = {23,44,56,78};
//		m.change1(arr);
//		System.out.println(Arrays.toString(arr));
//		for(int i = 100; i< 1000; i+=1) {
//			if(m.isArmstrong(i)) {
//				System.out.print(i+" ");
//			}
//			
//		}
//		System.out.println(m.isPrime(n));
//		
//		s.close();
//	}
//	
//	public boolean isArmstrong(int n) {
//		int temp = n;
//		int sum = 0;
//		while(n > 0) {
//			int rem = n % 10;
//			sum += Math.pow(rem, 3);
//			n /= 10;
//		}
//		
//		return sum == temp;
//		
//	}
	
//	public boolean isPrime(int n) {
//		if(n <= 1) {
//			return false;
//		}
//		for(int i = 2; i < Math.sqrt(n); i++) {
//			if(n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//
//	}
//	
//	public void change(int naam) {
//		naam = 10;
//	}
//	public void change1(int[] nums) {
//		nums[0] = 24;
//	}
		Main m = new Main("Gousik","7 LPA");
		System.out.println(m.getName());
		System.out.println(m.getSalary());
	}	
	String name, salary;

	
	public Main(String name, String salary){
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getSalary() {
		return salary;
	}
}
	
	// string reverse
//	public String stringReverse(String str) {
//		String reversed = "";
//		for(int i = str.length() - 1; i >= 0; i--) {
//			reversed += str.charAt(i);
//		}
//		
//		return reversed;
//	}
//	
	// using stringBuilder class
//	public String stringBuilder(String str /* num for numbers */) {
//		String str = Integer.toString(num);
//		StringBuilder strb = new StringBuilder(str).reverse();
//		String str1 = strb.toString();
//		
//		return str1;
		
//		return new StringBuilder (str).reverse().toString();
//	}

 

