package bits;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by aohana
 */
public class BitsOperationsTest {

    @Test
    public void testInsertBit() {

        assertEquals(1100, BitsOperations.insertBit(1024, 19, 6, 2));
    }

    @Test
    public void testFlipBitToWin() {
        assertEquals(8, BitsOperations.flipBitToWin(1775));
    }

    @Test
    public void debugger() {
        assertEquals(true, BitsOperations.debugger(1));
        for(int i=0; i<100; i++) {
            assertEquals(false, BitsOperations.debugger(new Random().nextInt()));
        }
    }

    @Test
    public void testConversion() {
        assertEquals(2, BitsOperations.conversion(29, 15));
    }
}
