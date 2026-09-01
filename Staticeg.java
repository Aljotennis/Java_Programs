class Employee {

	String name;

	static String company = "OpenAI";

	void Employee(String n) {

		name = n;

		}

	void display() {

		System.out.println( "Name : "+ name + "\nCompany : "+ company);

		}

}


public class Staticeg { 

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		Employee e2 = new Employee();

		Employee e3 = new Employee();

		e1.name = "Aljo";

		e2.name = "Rahul";

		e3.name = "Anu";

		e1.display();

		e2.display();

		e3.display();

	}

}
		