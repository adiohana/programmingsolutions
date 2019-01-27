package graphs;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by aohana
 */
public class GraphsTest {

    private LinkedList<String> projects = new LinkedList<>();
    private LinkedList<StringPair> dependencies = new LinkedList<>();

    private void createBuildOrderInput() {

        projects.add("a");
        projects.add("b");
        projects.add("c");
        projects.add("d");
        projects.add("e");
        projects.add("f");

        dependencies.add(new StringPair("a", "d"));
        dependencies.add(new StringPair("f", "b"));
        dependencies.add(new StringPair("b", "d"));
        dependencies.add(new StringPair("f", "a"));
        dependencies.add(new StringPair("d", "c"));

    }

    @Test
    public void testBuildOrder() {

        createBuildOrderInput();

        LinkedList<String> buildOrder = new LinkedList<>();
        buildOrder.add("f");
        buildOrder.add("e");
        buildOrder.add("b");
        buildOrder.add("a");
        buildOrder.add("d");
        buildOrder.add("c");

        LinkedList<String> resultBuildOrder = BuildOrder.buildOrder(projects, dependencies);

        assertEquals(buildOrder.get(0), resultBuildOrder.get(0));
        assertEquals(buildOrder.get(1), resultBuildOrder.get(1));
        assertEquals(buildOrder.get(2), resultBuildOrder.get(2));
        assertEquals(buildOrder.get(3), resultBuildOrder.get(3));
        assertEquals(buildOrder.get(4), resultBuildOrder.get(4));
        assertEquals(buildOrder.get(5), resultBuildOrder.get(5));
    }

}
