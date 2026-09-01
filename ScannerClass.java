import java.util.Scanner;

class ScannerClass {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your age : ");
	
	int age;

	while(!sc.hasNextInt()) {

	System.out.print("Invalid input. Enter an integer:");

	sc.next();

	}

	age = sc.nextInt();

	System.out.println("Age is : " + age);

	}

}

	