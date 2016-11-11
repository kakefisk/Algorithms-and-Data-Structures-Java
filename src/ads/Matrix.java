package ads;

public class Matrix {
	private int width = 0;
	private int height = 0;
	private int matrix[][];
	
	public Matrix(int width, int height) {
		this.width = width;
		this.height = height;
		matrix = new int[height][width];
	}
	
	public Matrix(int array[][]) {
		width = array[0].length;
		height = array.length;
		matrix = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				matrix[i][j] = array[i][j];
			}
		}
	}
	
	public Matrix copy() {
		Matrix m = new Matrix(width, height);
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				m.matrix[i][j] = matrix[i][j];
			}
		}
		return m;
	}
	
	public static Matrix identityMatrix(int size) {
		Matrix identity = new Matrix(size, size);
		for (int i = 0; i < size; i++) {
			identity.set(i, i, 1);
		}
		return identity;
	}
	
	public void set(int row, int col, int value) {
		matrix[row][col] = value; 
	}
	
	public int at(int row, int col) {
		return matrix[row][col];
	}
	
	public void multiply(Matrix other) {
		int copy[][] = new int[height][other.width];
		if (width == other.height) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < other.width; j++) {
					int value = 0;
					for (int k = 0; k < width; k++) {
						value += at(i, k) * other.at(k, j);
					}
					copy[i][j] = value;
				}
			}
		}
		width = other.width;
		matrix = copy;
	}
	
	public void power(int exponent) {
		for (int i = 1; i < exponent; i++) {
			multiply(this);
		}
	}
	
	public void add(Matrix other) {
		if (width == other.width && height == other.height) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					matrix[i][j] += other.matrix[i][j];
				}
			}
		}
	}
	
	public Matrix immutableMultiply(Matrix other) {
		Matrix m = new Matrix(other.width, height);
		if (width == other.height) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < other.width; j++) {
					int value = 0;
					for (int k = 0; k < width; k++) {
						value += at(i, k) * other.at(k, j);
					}
					m.set(i, j, value);
				}
			}
		}
		return m;
	}
	
	public Matrix immutablePower(int exponent) {
		Matrix m = copy();
		for (int i = 1; i < exponent; i++) {
			m.multiply(this);
		}
		return m;
	}
	
	public Matrix immutableAdd(Matrix other) {
		Matrix m = new Matrix(width, height);
		if (width == other.width && height == other.height) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					 m.set(i, j, matrix[i][j] + other.matrix[i][j]);
				}
			}
		}
		return m;
	}
	
	public int[][] toArray() {
		return matrix;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				result += matrix[i][j];
				if (j < width - 1) {
					 result += ", ";
				}
			}
			if (i < height - 1) {
				result += '\n';
			}
		}
		return result;
	}
}
