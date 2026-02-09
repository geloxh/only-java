import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int rndmNumber, input;
        rndmNumber = random.nextInt(0, 100);

        do {
            System.out.print("Guess: ");
            input = scn.nextInt();

            if (input > rndmNumber) {
                System.out.println("Go down");
            } else if (input < rndmNumber) {
                System.out.println("Go up");
            } else {
                System.out.println("You found number");
            }
        } while (rndmNumber!=input);
        scn.close();
    }
}