import java.util.Scanner;

public class Sumofnum {

	public static void main(String[] args) { 

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the number to find the sum: ");

	int b = s.nextInt();

	int a = 0;

	for (int i = 1; i <= b; i ++) {

		a = a + i;

		}
	
	System.out.println("Sum of " + b + " numbers is = " + a);

	s.close();

	}

}