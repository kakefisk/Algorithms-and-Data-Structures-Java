package ads;

public class NeighborMatrix extends Matrix {
	
	public NeighborMatrix(int width, int height) {
		super(width, height);
	}
	
	public NeighborMatrix(int array[][]) {
		super(array);
	}
	
	public boolean isSymetric() {
		return false;
	}
	
	public Graph getGraph() {
		return null;
	}
	
	public boolean isConnected() {
		// A+A^2+A^n all cells != 0 => connected
		return false;
	}
	
	public int degree(int node) {
		// Numbers of 1's in the node's row
		return 0;
	}
}
