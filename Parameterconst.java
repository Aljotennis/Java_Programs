class Student {

	String name;

	int age;

	Student(String n, int a) {

		name = n;

		age = a;

		}

	void display() {

		System.out.println(name);

		System.out.println(age);

		}

	}


public class Parameterconst {

	public static void main(String[] args) {

		Student s1 = new Student("Aljo",23);

		Student s2 = new Student("Rahul", 20);

		s1.display();

		s2.display();

		}

	}