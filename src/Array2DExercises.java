public class Array2DExercises {

	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	// return the average of all the values in the array.
	public static double getAverage(int[][] a) {
		double sum = 0;
		double count = 0;
        for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < a[i].length; j++) {
                        sum += a[i][j];
        	            count = count +1;
                       
                }
        }
        return (sum/count);
	}

	// return the total of the values in the specified row.
	public static int getRowTotal(int[][] a, int row) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[row][i];
		}
		return sum;
	}

	// return the total of the values in the specified column.
	public static int getColumnTotal(int[][] a, int column) {

		// Assume square array
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][column];
		}
		return sum;
	}

	// return the highest value in the specified row of the array.
	public static int getHighestInRow(int[][] a, int row) {

		int highest = a[row][0]; // Has to be defined by a number in array
		for (int i = 0; i < a.length; i++) {
			if (a[row][i] > highest) {
				highest = a[row][i];
			}
		}
		return highest;
	}

	// return the lowest value in the specified row of the array.
	public static int getLowestInRow(int[][] a, int row) {

		int lowest = a[row][0]; // Has to be defined by a number in array
		for (int i = 0; i < a.length; i++) {
			if (a[row][i] < lowest) {
				lowest = a[row][i];
			}
		}
		return lowest;
	}

	// return the lowest value in the specified column of the array
	public static int getHighestInColumn(int[][] a, int column) {

		int highest = a[0][column]; // Has to be defined by a number in array
		for (int i = 0; i < a.length; i++) {
			if (a[i][column] > highest) {
				highest = a[i][column];
			}
		}
		return highest;
	}

	// return the highest value in the specified column of the array
	public static int getLowestInColumn(int[][] a, int column) {

		int lowest = a[0][column]; // Has to be defined by a number in array
		for (int i = 0; i < a.length; i++) {
			if (a[i][column] < lowest) {
				lowest = a[i][column];
			}
		}
		return lowest;
	}

	// return the diagonal sum, bottom left to top right
	public static int getBottomLeftToTopRightDiagonalSum(int[][] a) {

		int numColumns = a.length;
		int topRight = a[0][numColumns];
		int bottomLeft = 0; // Cannot be optional
		for (int i = 0; i < a.length; i++) {
			bottomLeft = a[i][0]; // This is a promise
		}
		return bottomLeft + topRight;
	}

	// return the diagonal sum, top left to bottom right
	public static int getTopLeftToBottomRightDiagonalSum(int[][] a) {

		int topLeft = a[0][0];
		int bottomRight = 0; // Cannot be optional
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				bottomRight = a[i][j]; // This is a promise
			}
		}
		return bottomRight + topLeft;
	}

	// return true if the array is sorted low to high
	public static boolean isArraySorted(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int[] array = a[i];
			if ( isRowSorted(array) == false) {
				return false;
			}
		}		
		return true;
	}

	// return true if array is sorted high to low
	public static boolean isArrayReversed(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int[] array = a[i];
			if ( isRowInverse(array) == false) {
				return false;
			}
		}		
		return true;
	}

	// return true if array is jagged
	public static boolean isJaggedArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				return true;
			}
			
		}		
		return false;
	}

	// return true if array is square (n x n)
	public static boolean isSquareArray(int[][] a) {
		boolean rowsAreSame = true;
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				rowsAreSame = false;
			}
		}
		if (rowsAreSame == true && a.length == a[0].length) {
			return true;
		} else {
			return false;
		}
	}

	// return true if array is rectangular (n x m)
	public static boolean isRectangularArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				return false;
			}
			
		}		
		return true;
	}
	
	public static boolean isRowSorted(int[] a) {
		int prev = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= prev) {
				
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isRowInverse(int[] a) {
		int prev = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= prev) {
				
			} else {
				return false;
			}
		}
		return true;
	}

}
