package graphs;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by aohana
 */
public class BuildOrder {

    public static LinkedList<String> buildOrder(LinkedList<String> projects, LinkedList<StringPair> dependencies) {

        Graph projectsDependenciesGraph = createDependenciesGraph(projects, dependencies);

        Stack<Integer> buildStack = topologicalSorting(projectsDependenciesGraph);

        return getListFromStack(buildStack);

    }

    private static Stack<Integer> topologicalSorting(Graph projectsDependenciesGraph) {

        Stack<Integer> stack = new Stack<>();

        // Mark all the vertices as not visited
        boolean visited[] = new boolean[projectsDependenciesGraph.getSize()];

        for (int i = 0; i < projectsDependenciesGraph.getSize(); i++)
            visited[i] = false;

        // Call the recursive helper function to store
        // Topological Sort starting from all vertices
        // one by one
        for (int i = 0; i < projectsDependenciesGraph.getSize(); i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, stack, projectsDependenciesGraph);

        return stack;

    }

    private static void topologicalSortUtil(int v, boolean[] visited,
                                            Stack<Integer> stack, Graph projectsDependenciesGraph)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this
        // vertex
        GraphNode currentNode = projectsDependenciesGraph.getNodes()[v];

        for(int j=0; j<currentNode.getChildren().size(); j++) {
            i = currentNode.getChildren().get(j).getData();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack, projectsDependenciesGraph);
        }

        // Push current vertex to stack which stores result
        stack.push(v);
    }

    private static Graph createDependenciesGraph(LinkedList<String> projects, LinkedList<StringPair> dependencies) {

        Graph res = new Graph(6);

        for (int i = 0; i < projects.size(); i++) {
            res.addNode(i, ProjectsMapping.getMapping(projects.get(i)));
        }

        for (StringPair dependency : dependencies) {
            res.addEdge(ProjectsMapping.getMapping(dependency.getX()), new GraphNode(ProjectsMapping.getMapping(dependency.getY())));
        }

        return res;

    }

    private static LinkedList<String> getListFromStack(Stack<Integer> buildStack) {

        LinkedList<String> res = new LinkedList<>();

        while (!buildStack.isEmpty()) {
            res.add(ProjectsMapping.getMapping(buildStack.pop()));
        }

        return res;
    }

}
