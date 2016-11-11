package ads;

import java.util.HashMap;
import java.util.ArrayList;

public class TabularGraph {
	private int vertices[] = new int[100];
	private int values[] = new int[100];
	private int firstEdge[] = new int[100];
	private int edges[] = new int [500];
	private int endVertexId[] = new int[500];
	
	private int freeVertex = 0;
	private int start = -1;
	private int freeEdge = 0;
	
	public void insertNodeFirst(int value) {
		if (freeVertex != -1) {
			int vertexId = freeVertex;
			freeVertex = vertices[freeVertex];
			values[vertexId] = value;
			vertices[vertexId] = start;
			start = vertexId;
		}
	}
	
	public void insertEdge(int fromId, int toId) {
		if (firstEdge[fromId] == -1) // Ingen kanter
		{
			if (freeEdge != -1) { // Det er ledig plass til kanter
				int newEdgeId = freeEdge;
				freeEdge = edges[freeEdge];
				edges[newEdgeId] = -1;
				firstEdge[fromId] = newEdgeId;
				endVertexId[newEdgeId] = toId;
			}		
		}
	}
}
