import java.util.Scanner;

public class Squareofnum {

	public static void main(String[] args) { 

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the range of number to display the square: ");

	int b = s.nextInt();

	for (int i = 1; b >= i; i ++) {

		System.out.println(i + " ^2 = " + i * i);

	}

	s.close();

	}

}