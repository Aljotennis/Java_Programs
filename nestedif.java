import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the age: ");
	
	int age = s.nextInt();

	if ( age < 18 ) {
		
		System.out.println(" Your are not eligible to drive, age must be >= 18.");

		}
	else {

	System.out.print("Enter the user has licence or not (true or false): ");

	boolean licence = s.nextBoolean();

	if ( age >= 18) {

		if (licence == true) {
			
			System.out.println("You are eligible to drive");
			
			}
		else {

		System.out.println("You are not eligible to drive");
		}

		}
	
	}
	}

}

	

