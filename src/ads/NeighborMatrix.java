package ads;

public class NeighborMatrix extends Matrix {
	
	public NeighborMatrix(int size) {
		super(size, size);
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
	
	public boolean isCyclic() {
		// A+A^2+A^n all cells != 0 => cyclic
		
		/** hmm
		 * M + M^2 + ... + M^n = N
		 * Svar beregn N, beregn sum lik summen av tallene i diagonalen til N
		 * Hvis sum>0 sp er grafen syklisk.
		 */
		return false;
	}
	
	public int degree(int node) {
		// Numbers of 1's in the node's row
		return 0;
	}
}
