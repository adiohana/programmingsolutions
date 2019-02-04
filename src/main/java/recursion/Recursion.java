package recursion;

/**
 * Created by aohana
 */
public class Recursion {

    public static int recursiveMult(int x, int y) {

        if(x==0 || y==0) {
            return 0;
        }
        if(x==1) {
            return y;
        }
        if(y==1) {
            return x;
        }
        if(x>y) {
            return recursiveMult(x, y-1) + x;
        } else {
            return recursiveMult(x-1, y) + y;
        }
    }

    public static int recursiveMultBitwise(int x, int y) {

        if(x==0 || y==0) {
            return 0;
        }
        if(x==1) {
            return y;
        }
        if(y==1) {
            return x;
        }
        if(x>y) {
            return recursiveMult(x, bitwiseSubtract(y)) + x;
        } else {
            return recursiveMult(bitwiseSubtract(x), y) + y;
        }
    }

    public static int bitwiseSubtract(int x) {

        int lsbIndex = findLSB(x);
        int res = clearBit(x, lsbIndex);

        return res<<lsbIndex;
    }

    private static int findLSB(int x) {

        int mask = ( x & ~(x-1) );

        int res = 0;
        while(mask > 0) {
            res++;
            mask = mask>>1;
        }

        return res-1;

    }

    private static int clearBit(int x, int index) {
        return ( x & ~(1<<index) );
    }

}
