import java.util.Arrays;

public class ArrangeArray { /** Arrange numbers to biggest numbers **/

	private static Integer[] arrangeArray(Integer[] numbers) {
		/**
		 * Sorts numbers based on which order produces a bigger combined number, 
		 * not based on their actual value.
		 * 
		 * */

		Arrays.sort(numbers, (o1, o2) -> Integer.parseInt(o1 + "" + o2) >= Integer.parseInt(o2 + "" + o1) ? -1 : 1);

		return numbers;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrangeArray(new Integer[]{45, 567, 12, 1})));
		System.out.println(Arrays.toString(arrangeArray(new Integer[]{54, 546, 548, 60})));
		System.out.println(Arrays.toString(arrangeArray(new Integer[]{1, 34, 3, 98, 9, 76, 45, 4})));
	}
}
