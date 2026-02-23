public class PrimeNumbers {
	
	public static void main(String[] args) {
		int counter = 0;
		int number = 2; // start checking from 2 (smallest prime)

		/** for (int i = 0; true; i++) { // infinite loop until break for looking next prime number
			if (counter != 50) { // needs 50 number
				if (isPrime(i)) {
					System.out.print(i + " ");
					counter++;
					if (counter % 10 == 0) { // next line after every 10 number
						System.out.println();
					}
				}

				else (break) {
					return;
				}
			}
		}; **/

		while (counter < 50) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				counter++;

				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			number++; // move to next number to check
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = n - 1; i >= 2; i--) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

		/** while (otherNumber != 1) {
			if (i % otherNumber == 0) {
				return fals;
			}

			otherNumber--;
		}
		return true;
		**/
	}
}