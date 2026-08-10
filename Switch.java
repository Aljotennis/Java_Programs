import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the ticket type number: ");

	int a = s.nextInt();

	switch (a) {

		case 1:
		
		System.out.println("Ticket - VIP");

		break;

		case 2:

		System.out.println("Ticket - premium");

		break;

		case 3:

		System.out.println("Ticket - Regular");

		break;
		
		
		default:

		System.out.println("Invalid ticket type");

		break;

		}


	}

}