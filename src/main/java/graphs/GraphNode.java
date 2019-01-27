package graphs;

import java.util.LinkedList;

/**
 * Created by aohana
 */
public class GraphNode {

    private Integer data;
    private LinkedList<GraphNode> children;

    GraphNode(Integer data) {
        this.data = data;
        children = new LinkedList<>();
    }

    public LinkedList<GraphNode> getChildren() {
        return children;
    }

    public Integer getData() {
        return data;
    }
}
