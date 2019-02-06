package moderate;

import java.util.Collections;
import java.util.List;

/**
 * Created by aohana
 */
public class Moderate {

    public static int smallestDifference(List<Integer> list1, List<Integer> list2) {

        Collections.sort(list1);
        Collections.sort(list2);

        int index1 = 0;
        int index2 = 0;

        int smallestDiff = 999;

        while (index1 < list1.size() && index2 < list2.size()) {

            if (list1.get(index1) - list2.get(index2) < smallestDiff && list1.get(index1) - list2.get(index2) >= 0) {
                smallestDiff = list1.get(index1) - list2.get(index2);
            } else if (list2.get(index2) - list1.get(index1) < smallestDiff && list2.get(index2) - list1.get(index1) >= 0) {
                smallestDiff = list2.get(index2) - list1.get(index1);
            }

            if (list1.get(index1) - list2.get(index2) >= 0) {
                index2++;
            } else {
                index1++;
            }
        }

        return smallestDiff;
    }

    public static int mult(int x, int y) {

        if (x == 0 || y == 0) {
            return 0;
        }

        if (x > y) {
            return multHelper(x, y);
        } else {
            return multHelper(y, x);
        }
    }

    private static int multHelper(int x, int y) {

        int res = 0;

        while (y > 0) {
            res += x;
            y = bitwiseSubtractOne(y);
        }

        return res;
    }

    private static int bitwiseSubtractOne(int x) {
        return ((x << 1) + (~x));
    }

    public static int subtract(int x, int y) {
        return (x + ((~y) + 1));
    }

    public static Integer divide(int x, int y) {

        if (y == 0) {
            return null;
        }

        if (x == 0) {
            return 0;
        }

        if(x<y) {
            return 0;
        }

        int res = 0;
        while (x > 0) {
            x = subtract(x, y);
            res++;
        }

        return res;
    }

}
