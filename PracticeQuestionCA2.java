class Employee {

	String name;

	double basicSalary;

	Employee(String name, double basicSalary) {

	this.name = name;

	this.basicSalary = basicSalary;

	}

	double calculateSalary() {

	return basicSalary;

	}

}


class Manager extends Employee 	{

	double bonus;

	Manager(double bonus, String name, double basicSalary) {

	this.bonus = bonus;

	super(name, basicSalary);

	}
	
	@Override

	double calculateSalary() {

	return super.calculateSalary() + bonus;

	}

}


class PracticeQuestionCA2 {

	public static void main(String[] args) {

	Manager m = new Manager(200, "Aljo", 20000);

	System.out.println("Name : " + m.name);

	System.out.println("Basic Salary : " + m.basicSalary);

	System.out.println("Bonus : " + m.bonus);

	System.out.println("Final salary : " + m.calculateSalary());

	}

}


	