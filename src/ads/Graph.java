package ads;

public class Graph {
	private static class Node {
		public int value = 0;
	}
	
	private static class Path {
		public boolean isClosed() {
			return false;
		}
		
		public boolean isSimple() {
			return false;
		}
		
		public boolean isCyclic() {
			return false;
		}
	}
	
	private static class AdjacencyList {
		ArrayList<ArrayList<Node>> list;
	}
	
	private static class Vertex {
		int nr = 0;
		ArrayList<Vertex> list = new ArrayList<Vertex>();
	}
	
	public boolean isComplete() {
		return false;
	}
	
	public boolean isConnected() {
		return false;
	}
	
	public boolean[][] getNeighborMatrix() {
		return null;
	}
	
	public static int numEdgesInCompleteGraph(int nodeNum) {
		// TODO: Try to avoid recursion
		if (nodeNum == 2) return 1;
		return numEdgesInCompleteGraph(nodeNum - 1) + nodeNum - 1;
		//return (nodeNum + 1)*nodeNum/2 - 1;
	}
}
