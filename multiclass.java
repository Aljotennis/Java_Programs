class Student {

	String name;

	int age;

	void display() {

		System.out.println(name);

		System.out.println(age);

		}
	}

public class multiclass {

	public static void main(String[] args){

		Student s1 = new Student();

		s1.name = "Aljo";

		s1.age = 22;

		s1.display();

		}

	}