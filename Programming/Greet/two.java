import java.util.Scanner;

public class two {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("New Employee Name: " );
		String input = scanner.nextLine();

		System.out.println("Hi " + input + "! It's nice to meet you!"); 

		scanner.close();
	}
}