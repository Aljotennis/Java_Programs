class Person {

	String name;

	void display() {

	System.out.println("Name : " + name);

	System.out.println("Person details");

	}

}

class Student extends Person {

	@Override

	void display() {

	System.out.println("Student details");

	super.display();

	}

}


class PolymorphismSuper {

	public static void main (String[] args) {

	Student s = new Student();

	s.name = "Aljo";

	s.display();

	}

}

	