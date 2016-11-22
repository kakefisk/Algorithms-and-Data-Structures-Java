import ads.ArrayList2;
import ads.BinaryTree;
import ads.BinaryTree.SearchMethod;
import ads.Callback;
import ads.CircularBuffer;
import ads.DoublyLinkedList;
import ads.Graph;
import ads.LinkedList;
import ads.Matrix;
import ads.NeighborMatrix;

public class Program {

	public static void main(String[] args) {
		Graph g = new Graph();
	    Graph.Vertex frankfurt = g.addVertex(10);
	    Graph.Vertex wurzburg = g.addVertex(20);
	    Graph.Vertex munchen = g.addVertex(30);
	    g.addPath(frankfurt, munchen);
	    g.addDirectedPath(frankfurt, wurzburg);
	    g.addDirectedPath(wurzburg, munchen);
	    NeighborMatrix matrix = g.getNeighborMatrix();
	    System.out.println(matrix);
	}

}
