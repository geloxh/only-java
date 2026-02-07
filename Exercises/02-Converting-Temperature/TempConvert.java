import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("3. Choose an option (1 or 2): ");
        
        int choice = scn.nextInt();

        if (choice == 1) {
            // Fahrenheit to Celsius Conversion
            System.out.print("Enter the Fahrenheit: ");
            double Fahrenheit = scn.nextDouble();
            double Celsius = (5.0 / 9) * (Fahrenheit - 32);
            System.out.println(Fahrenheit + " Fahrenheit equals " + Celsius + " Celsius.");
        } else if (choice == 2) {
            // Celsius to Fahrenheit Conversion
            System.out.println("Enter the Celsius: ");
            double Celsius = scn.nextDouble();
            double Fahrenheit = (Celsius * 9.0 / 5) + 32;
            System.out.println(Celsius + " Celsius equals " + Fahrenheit + " Fahrenheit");

        } else {
            // invaid input to handling
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scn.close();
    }
}