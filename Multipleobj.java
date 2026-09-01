class Student {

	String name;

	int age;

	void displayName() {

		System.out.println(name);

			}

	void displayAge() {

		System.out.println(age);

			}

	}


public class Multipleobj {

	public static void main(String[] args) { 

			Student s1 = new Student();

			Student s2 = new Student();

			s1.name = "Aljo";

			s1.age = 23;

			s2.name = "jaiben";

			s2.age = 22;

			s1.displayName();
			s1.displayAge();


			s2.displayName();
			s2.displayAge();

			}

	}