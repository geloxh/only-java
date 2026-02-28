import java.util.*;
public class calcAve {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("How many numbers?");
            int count = scn.nextInt();
            int[] numbers = new int[count];
            double average = 0;

            for (int i = 0; i < count; i++) {
                System.out.print("Enter the " + (i + 1) + ". number : ");
                numbers[i] = scn.nextInt();
                average += numbers[i];
            }

            average = average / count;
            System.out.println("Average: " + average);

            int counter = 0;
            for (int i = 0; i < count; i++) {
                if (numbers[i] > average)
                counter++;
            }

            System.out.println(counter + " numbers are above the average.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}