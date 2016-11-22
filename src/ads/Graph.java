package ads;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	
	private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	private ArrayList<Path> paths = new ArrayList<Path>();
	 
	public class Vertex {
		public int value = 0;
		
		private ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
		
		public Vertex(int value) {
			this.value = value;
		}
		
		public void addNeighbor(Vertex vertex) {
			neighbors.add(vertex);
		}
		
		public ArrayList<Vertex> getNeighbors() {
			return neighbors;
		}
	}
	
	private static class Path {
		private Vertex start;
		private Vertex end;
		
		private int weight = 1;
		
		public Path(Vertex start, Vertex end) {
			this.start = start;
			this.end = end;
		}
		
		public Path(Vertex start, Vertex end, int weight) {
			this(start, end);
			this.weight = weight;
		}
		
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
		ArrayList<ArrayList<Vertex>> list;
	}
	
	public Vertex addVertex(int value) {
		Vertex vertex = new Vertex(value);
		vertices.add(vertex);
		return vertex;
	}
	
	public void addPath(Vertex start, Vertex end) {
		addDirectedPath(start, end);
		addDirectedPath(end, start);
	}
	
	public void addPath(Vertex start, Vertex end, int weight) {
		addDirectedPath(start, end, weight);
		addDirectedPath(end, start, weight);
	}
	
	public void addDirectedPath(Vertex start, Vertex end) {
		start.addNeighbor(end);
		paths.add(new Path(start, end));
	}
	
	public void addDirectedPath(Vertex start, Vertex end, int weight) {
		start.addNeighbor(end);
		paths.add(new Path(start, end, weight));
	}
	
	public boolean isComplete() {
		return false;
	}
	
	public boolean isConnected() {
		return false;
	}
	
	public NeighborMatrix getNeighborMatrix() {
		NeighborMatrix matrix = new NeighborMatrix(vertices.size());
		HashMap<Vertex, Integer> map = new HashMap<Vertex, Integer>();
		int id = 0;
		for (Vertex v : vertices) {
			map.put(v, id++);
		}
		for (Path p : paths) {
			matrix.set(map.get(p.start), map.get(p.end), 1);
		}
		return matrix;
	}
	
	public ArrayList<Vertex> fastestPath() {
		return null;
	}
	
	public static int numEdgesInCompleteGraph(int nodeNum) {
		// TODO: Try to avoid recursion
		if (nodeNum == 2) return 1;
		return numEdgesInCompleteGraph(nodeNum - 1) + nodeNum - 1;
		//return (nodeNum + 1)*nodeNum/2 - 1;
	}
}
