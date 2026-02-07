import java.util.Scanner; 
- Purpose: Imports the Scanner class from Java's utility library.
- Functin: Makes the Scanner class available for use in your program

public class TwoDigits
- public: This class is accessible from anywhere
- class: Declares a new Java class (a blueprint for objects)
- TwoDigits: The name of class (must match the filename)
- Purpose: Creates the main container for your program

public static void main(String[] args)
- public: Anyone can call this method
- static: Method belongs to the class, not individual objects
- void: Method doesn't return any value
- main: The entry-point Java runs this method first when you execute the program
- String[] args: Array of command-line arguments (usually empty for simplr programs)
- Purpose: This is where your program's execution begins

Scanner scn = new Scanner(System.in);
- Scanner scn: Creates a variable named scn of type Scanner
- = new Scanner(System.in): Initializes it to read fom keyboard input
- System.in: The standard input stream
- Purpose: sets up the tool to get input from the user.

System.out.print("Enter a 2-digit number : ");
- System.out.print(): Prints text to the screen
- "Enter a 2-digit number : ": The message displayed to the user
- print(): the cursor stays on the same line for user input
- Purpose: Prompts the user to enter a number

int number = scn.nextInt();
int number: Creates an integer variable named number
scn.nextInt(): Reads the next integer the user types
Purpose: Captures the user's input and stores it in the number variable

int digitNumber1 = number / 10;
- number / 10: Integer division that removes the ones place
- Explanation using example:
    45 / 10 = 4 (the 4 is kept, the decimal part is dicarded)
    78 / 10 = 7
    92 / 10 = 9
- digitNumber1: Stores the tens digit
- Purpose: Extracts the first digit from the left

int digitNumber2 = number % 10;
- %: Modulo operator (returns the remainder after division)
- number % 10: Gives the remainder when dividing by 10
- Explanation using example: 
    45 % 10 = 5(remainder is 5)
    78 % 10 = 8(remainder is 8)
    98 % 10 = 2 (remainder is 2)
- digitNumber2: Stores the ones digit
- Purpose: Extracts the second digit from the right

System.out.println("The digits are " + digitNumber1 + " and " + digitNumber2);
- System.out.println: Prints text and creates a new line
- Strings concatenation (+): Joins strings and variables together
- Example: The digits are 4 and 5

scn.close();
- close(): Closes the Scanner object
- Explanation: Releases the resource and stops reading from keyboard
- Best practice: always close resources when done to avoid memory leaks
- Purpose: Cleans up and properly ends the program