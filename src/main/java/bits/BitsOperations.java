package bits;

/**
 * Created by aohana
 */
public class BitsOperations {

    public static int insertBit(int N, int M, int i, int j) {

        int index = 0;
        Integer res = N;

        while(j<=i) {
            res = updateBit(res, j, getBit(M, index));
            index++;
            j++;
        }

        return res;

    }

    private static Integer updateBit(int num, int index, int value) {

        int mask = ~(1<<index);
        return  (num & mask) | (value<<index);

    }

    private static int getBit(int num, int index) {
        if ((num & (1<<index)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int flipBitToWin(int num) {

        boolean[] bits = getAsBits(num);

        int amountOfZeros = 0;
        int sequenceCount = 0;
        int maxSequence = 0;
        for(int i=0; i<32; i++) {

            if(bits[i]) {
                sequenceCount++;
            } else {
                if(amountOfZeros == 0) {
                    amountOfZeros++;
                    sequenceCount++;
                } else {
                    amountOfZeros = 0;
                    if(sequenceCount > maxSequence) {
                        maxSequence = sequenceCount;
                    }
                    sequenceCount = 0;
                }
            }
        }

        return maxSequence;
    }

    private static boolean[] getAsBits(int num) {

        boolean[] res = new boolean[32];

        for(int i=0; i<32; i++) {
            res[i] = false;
        }

        int i = 0;

        while(num > 0) {
            if(num%2 != 0) {
                res[i] = true;
            }
            num = num/2;
            i++;
        }

        return res;

    }

    public static boolean debugger(int n) {
        return ( (n & (n - 1) )  == 0);
    }

    public static int conversion(int A, int B) {

        int C = A^B;
        int res = 0;

        while(C > 0) {
            if(C%2 != 0) {
               res++;
            }
            C = C/2;
        }

        return res;
    }
}
