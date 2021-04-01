package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        float af = (float) a;
        float bf = (float) b;

        for (int i = 0; i <= a; i++) {
            if (af / i == Math.floor(af / i)) {
                arrayList.add(i);
            }
        }
        int i = b;
        while (i <= b) {
            if ((bf / i == Math.floor(bf / i)) && arrayList.contains(i)) {
                return i;
            }
            i--;
        }
        return 0;
    }


    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findLowestCommonMultiple(int a, int b) {
        int c;
        int d;

        for (int i = 1; i <= b; i++) {
            c = a * i;
            for (int j = 1; j <= a; j++) {
                d = b * j;
                if (c == d) {
                    return c;
                }
            }
        }
        return 0;
    }

}
