package ads;

import java.util.HashMap;
import java.util.ArrayList;

public class Graph2 {
	
	private static class Vertex {
		private String name = null;
		// Dette er en liste over de kantene som har denne noden som startpunkt
		private ArrayList<Edge> edges = new ArrayList<Edge>();
		
		public Vertex(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ArrayList<Edge> getEdges() {
			return edges;
		}
		public void setEdges(ArrayList<Edge> edges) {
			this.edges = edges;
		}
	}
	
	private static class Edge {
		private Vertex start = null, end = null;
		
		public Edge(Vertex start, Vertex end) {
			this.start = start;
			this.end = end;
		}

		public Vertex getStart() {
			return start;
		}

		public void setStart(Vertex start) {
			this.start = start;
		}

		public Vertex getEnd() {
			return end;
		}

		public void setEnd(Vertex end) {
			this.end = end;
		}
	}
	
	private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	private HashMap<String, Vertex> table = new HashMap<String, Vertex>();
	
	public void addVertex(String name) {
		Vertex v = new Vertex(name);
		vertices.add(v);
		table.put(name, v);
	}
	
	public void addEdge(String fromName, String toName) {
		Vertex from = table.get(fromName);
		if (from == null) {
			// TODO: error handling
		}
		Vertex to = table.get(toName);
		if (to == null) {
			// TODO: error handling
		}
		ArrayList<Edge> ae = from.getEdges();
		Edge e = new Edge(from, to);
		ae.add(e);
	}
	
	public int getIndegree(String name) {
		Vertex node = table.get(name);
		int count = 0;
		for (Vertex v : vertices) {
			for (Edge e : v.getEdges()) {
				if (e.end == node) {
					count++;
				}
			}
		}
		return count;
	}
	
	public int getOutdegree(String name) {
		Vertex from = table.get(name);
		ArrayList<Edge> ae = from.getEdges();
		return ae.size();
	}
}

