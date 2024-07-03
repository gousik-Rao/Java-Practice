package pack.Practice;

public class Car {
	String make,model;
	int year;
	double mileage;

	// parameterized constructor
	public Car(String make, String model, int year, Double mileage){
		this. make=make;
		this. model=model;
		this. year=year;
		this. mileage=mileage;

	}

	public void drive(double distance) {
		if(distance > 0) {
			mileage += distance;
			System.out.println("Drove "+distance+" Kilometers. Total mileage is now: "+ mileage);
		}else {
			System.out.println("Error in distance");
		}

	}

	public void printCarDetails() {
		System.out.println("This car is a "+make+" make, "+model+
				" model.\nIt came out in the year "+year+". We can expect a mileage of "+mileage+" Kilometers");
	}

	public static void main(String[] arg) {
		Car c1=new Car("Taiwan", "'Hb1'" ,1963,20.0);

		c1.drive(156);
		c1.printCarDetails();
	}
}
