package ads;

public class Matrix {
	private int width = 0;
	private int height = 0;
	private int matrix[][];
	
	public Matrix(int width, int height) {
		this.width = width;
		this.height = height;
		matrix = new int[width][height];
	}
	
	public void set(int row, int col, int value) {
		matrix[row][col] = value; 
	}
	
	public void multiply(Matrix matrix) {
		
	}
	
	public void power(int exponent) {
		
	}
	
	public void add(Matrix matrix) {
		
	}
	
	public Matrix immutableMultiply(Matrix matrix) {
		return null;
	}
	
	public Matrix immutablePower(int exponent) {
		return null;
	}
	
	public Matrix immutableAdd(Matrix matrix) {
		return null;
	}
}
