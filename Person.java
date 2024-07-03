package pack.Practice;

public class Person {
	String name;
	int age;

	Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	Person(){
		System.out.println("Unknown Person");
	}

	public void printDetails() {
		System.out.println("Hi !! My name is "+name+
				" I'm "+age+" years old");
	}

	public static void main(String[] args) {
		Person p1=new Person("Rahul",34);
		p1.printDetails();
		Person p2;
		p2=new Person();



	}
}
