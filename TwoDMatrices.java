import java.util.*;

class TwoDMatrices { 

	public static void main(String[] args) { 
		TwoDMatrix matrix = new TwoDMatrix(3,4);
		matrix.populateMatrix();
		int value = 34;
		if(matrix.valueInMatrix(value)) { 
			System.out.println(value + " is in the matrix!");
		} else { 
			System.out.println("The matrix does not have this value.");
		}
	}

}

class TwoDMatrix { 
	int rows;
	int cols;
	int[][] matrix; 

	public TwoDMatrix(int row, int col) { 
		this.rows = row; 
		this.cols = col;
		this.matrix = new int[rows][cols];
	}

	public void populateMatrix() { 
		this.matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}; // lol
	}

	public boolean valueInMatrix(int target) { 
		if(matrix.length < 1 || matrix[0].length < 1) return false;

		boolean output = false;

		int low = 0;
		int high = rows * cols - 1;

		while(low <= high) { 
			int mid = (int)Math.floor((low + high) / 2);
			int rowIdx = mid / cols;
			int colIdx = mid % cols; 

			int candValue = matrix[rowIdx][colIdx];
			// System.out.println(candValue);
			if(candValue == target) { 
				output = true; 
				break;
			} else if (candValue < target) { 
				low = mid + 1;
			} else { 
				high = mid - 1;
			}
		}

		return output;
	}
}