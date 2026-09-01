import java.util.Scanner;

public class sumofnumber {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the number: ");

	int a = s.nextInt();

	int b = 0;

	for (; a > 0; a = a / 10) {

		b ++;

		}

	System.out.println(b);

	}

}