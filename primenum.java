import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the number: ");

	int a = s.nextInt();

	int count = 0;

	if ( a <= 1 ) {

		System.out.println("Number is not a prime number");
	
		}

	for (int i = 2; i < a; i ++) {

		if (a % i == 0) {

			count ++;

			break;

		}

	}
	
	if (count == 0) {

		System.out.println("is Prime");
        
	}


	else {

            System.out.println("Not Prime");

	}

   
 }

}


		

