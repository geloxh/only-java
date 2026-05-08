import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name1 = "Alice";
		String name2 = "Bob";

		System.out.print("What is your name ? ");
		String input = scanner.nextLine();

		if (input.equalsIgnoreCase(name1)) {
			System.out.println("Hello " + name1 + "! It's nice to meet you!");
		} else if (input.equalsIgnoreCase(name2)) {
			System.out.println("Hi " + name2 + "! It's great to meet you also!");
		} else {
			System.out.println("Oh! Hello " + input + "! Are you new here? ");
		}

		scanner.close();
	}
}