public class BooleanMatrix {

	public static void modifyBooleanMatrix(int[][] a) {

		int rowFlag = 0, columnFlag = 0;


		// if a[i][j] is 1 then we make a[0][j] 1 and a[i][0] 1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == 0 || j == 0) {
					if (a[i][0] == 1) {
						rowFlag = 1;
					}
					if (a[0][j] == 1) {
						columnFlag = 1;
					}
				} else if (a[i][j] == 1) {
					a[0][j] = 1;
					a[i][0] = 1;
				}
			}
		}

		// if a[0][j] is 1 or a[i][0] is 1 then a[i][j] is 1
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if (a[0][j] == 1 || a[i][0] == 1) {
					a[i][j] = 1;
				}
			}
		}

		if (rowFlag == 1) {
			for (int j = 0; j < a[0].length; j++) {
				a[0][j] = 1;
			}
		}

		if (columnFlag == 1) {
			for (int i = 0; i < a.length; i++) {
				a[i][0] = 1;
			}
		}
	}

	private static void print2DMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] array = new int[][]{{1, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 0, 0}};
		print2DMatrix(array);
		modifyBooleanMatrix(array);
		print2DMatrix(array);

		System.out.println("------------");
		array = new int[][]{{1, 0}, {0, 0}};
		print2DMatrix(array);
		modifyBooleanMatrix(array);
		print2DMatrix(array);
	}
}