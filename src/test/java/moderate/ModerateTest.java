package moderate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aohana
 */
public class ModerateTest {

    @Test
    public void smallestDifferenceTest() {

        List<Integer> list1 = createFirstList();
        List<Integer> list2 = new ArrayList<>();

        list2.add(23);
        list2.add(127);
        list2.add(235);
        list2.add(16);
        list2.add(8);

        assertEquals(1, Moderate.smallestDifference(list1, list2));

    }

    private List<Integer> createFirstList() {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(3);
        res.add(15);
        res.add(11);
        res.add(2);
        return res;
    }

    @Test
    public void smallestDifferenceTest2() {

        List<Integer> list1 = createFirstList();
        List<Integer> list2 = new ArrayList<>();

        list2.add(23);
        list2.add(127);
        list2.add(235);
        list2.add(19);
        list2.add(8);

        assertEquals(3, Moderate.smallestDifference(list1, list2));

    }

    @Test
    public void multTest1() {
        assertEquals(12, Moderate.mult(4, 3));
    }

    @Test
    public void multTest2() {
        assertEquals(0, Moderate.mult(4, 0));
    }

    @Test
    public void multTest3() {
        assertEquals(30, Moderate.mult(6, 5));
    }

    @Test
    public void subtractTest1() {
        assertEquals(30, Moderate.subtract(50, 20));
    }

    @Test
    public void subtractTest2() {
        assertEquals(-30, Moderate.subtract(50, 80));
    }

    @Test
    public void divideTest1() {
        assertEquals(null, Moderate.divide(50, 0));
    }

    @Test
    public void divideTest2() {
        assertEquals(new Integer(2), Moderate.divide(50, 25));
    }

    @Test
    public void divideTest3() {
        assertEquals(new Integer(0), Moderate.divide(0, 25));
    }

    @Test
    public void divideTest4() {
        assertEquals(new Integer(3), Moderate.divide(9, 3));
    }

    @Test
    public void divideTest5() {
        assertEquals(new Integer(0), Moderate.divide(3, 9));
    }

}
