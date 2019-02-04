package recursion;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aohana
 */
public class RecursionTest {

    @Test
    public void testRecursiveMult() {
        assertEquals(18, Recursion.recursiveMult(3, 6));
        assertEquals(0, Recursion.recursiveMult(0, 6));
        assertEquals(0, Recursion.recursiveMult(3, 0));
        assertEquals(0, Recursion.recursiveMult(0, 0));
        assertEquals(1, Recursion.recursiveMult(1, 1));
        assertEquals(81, Recursion.recursiveMult(1, 81));
        assertEquals(81, Recursion.recursiveMult(81, 1));
    }

    @Test
    public void testRecursiveMultBitwise() {
        assertEquals(18, Recursion.recursiveMultBitwise(3, 6));
        assertEquals(0, Recursion.recursiveMultBitwise(0, 6));
        assertEquals(0, Recursion.recursiveMultBitwise(3, 0));
        assertEquals(0, Recursion.recursiveMultBitwise(0, 0));
        assertEquals(1, Recursion.recursiveMultBitwise(1, 1));
        assertEquals(81, Recursion.recursiveMultBitwise(1, 81));
        assertEquals(81, Recursion.recursiveMultBitwise(81, 1));
    }

    @Test
    public void testBitwiseSubtract() {
        assertEquals(2, Recursion.bitwiseSubtract(3));
    }

}
