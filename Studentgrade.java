import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the grade of the student: ");

	char a = s.next().charAt(0); 
	
	switch(a) {

	case 'A':
	case 'a':

	System.out.println("Excellent");

	break;

	case 'B':
	case 'b':

	System.out.println("Very good");

	break;

	case 'C':
	case 'c':

	System.out.println("Good");

	break;

	case 'D':
	case 'd':

	System.out.println("Pass");

	break;

	case 'F':
	case 'f':

	System.out.println("Fail");

	break;

	default:

	System.out.println("Invalid choice");

	break;

	}

	s.close();
}

}