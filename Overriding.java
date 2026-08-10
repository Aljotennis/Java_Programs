class Vehicle {

	void display() {

	System.out.println("This is a Vehicle");

	}
}

class Car extends Vehicle {

	@Override

	void display() {

	System.out.println("This is a car");

	super.display();

	}

}


class Overriding {

	public static void main(String[] args) {

		Car c = new Car();

		c.display();

	}

}