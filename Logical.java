import java.util.Scanner;

public class Logical {

    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);	

        System.out.print("Enter a number: ");
	
	int a = s.nextInt();

	System.out.print("Enter another number: ");
	
	int b = s.nextInt();
	
	System.out.println((a > b) && (a < 100));
	System.out.println((a > b) || (a < 100));
	System.out.println(!(a > b));
    }
}