class Employee {

	void calculatePay() {

	System.out.println("Employee salary");

	}

}

class Manager extends Employee {

	@Override

	void calculatePay() {

	System.out.println("Manager salary");

	}

}

class Developer extends Employee {

	@Override

	void calculatePay() {

	System.out.println("Developer salary");

	}

}

class PolymorphismArray {

	public static void main(String[] args) {

	Employee[] employees = new Employee[3];	
	
	employees[0] = new Employee();

	employees[1] = new Manager();

	employees[2] = new Developer();

	for (int i = 0; i < employees.length; i ++) {
		
		employees[i].calculatePay();

	}

	}

}

		
	