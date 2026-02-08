import java.util.*;

public class If_Else {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        int x1 = random.nextInt(0, 10);
        int x2 = random.nextInt(0, 10);
        System.out.println("What is " + x1 + " + " + x2 + " ?");

        int input = scn.nextInt();

        if (x1+x2==input) {
            System.out.println("Answer is Correct.");
        } else {
            System.out.println("Answer is Incorrecct.");
        }
    }
}