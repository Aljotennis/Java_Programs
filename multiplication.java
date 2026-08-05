import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) { 

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the number that you want to display the table: ");

	int b = s.nextInt();

	for (int i = 1; i <= 10; i ++) {

		System.out.println(b + " * " + i + " = " + i * b);

		}

	s.close();

	}

}