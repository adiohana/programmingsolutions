package graphs;

/**
 * Created by aohana
 */
public class Graph {

    private int size;
    private GraphNode[] nodes;

    Graph(int size) {
        nodes = new GraphNode[size];
        this.size = size;
    }

    public void addNode(int nodeIndex, Integer data) {
        nodes[nodeIndex] = new GraphNode(data);
    }

    public void addEdge(int nodeIndex, GraphNode node) {
        nodes[nodeIndex].getChildren().add(node);
    }

    public GraphNode[] getNodes() {
        return nodes;
    }

    public int getSize() {
        return size;
    }
}
