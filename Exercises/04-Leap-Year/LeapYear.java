import java.util.Scanner;

/**
 * Leap year is a year that is divisible by 4 but not by 100.
 * or it is divisible by 400.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = scn.nextInt();
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        scn.close();
    }
}