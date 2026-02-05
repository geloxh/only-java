import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a 2-digit number : ");

        int number = scn.nextInt();
        int digitNumber1 = number / 10;
        int digitNumber2 = number % 10;
        System.out.println("The digits are " + digitNumber1 + " and " + digitNumber2);
        scn.close();
    }
}