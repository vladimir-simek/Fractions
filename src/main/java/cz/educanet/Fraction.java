package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)

    /**
     * Adds the fraction to the other fraction. Returns a new fraction.
     *
     * @param other
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        throw new UnsupportedOperationException();
    }

    /**
     * Subtracts other from the fraction. Returns a new fraction.
     *
     * @param other
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        throw new UnsupportedOperationException();
    }

    /**
     * Multiplies the two fractions. Returns a new fraction.
     *
     * @param other
     * @return new fraction
     */
    public Fraction times(Fraction other) {
        throw new UnsupportedOperationException();
    }

    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     *
     * @param other
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        throw new UnsupportedOperationException();
    }
    //endregion

    //region: other operations

    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     *
     * @return new fraction
     */
    public Fraction getReciprocal() {
        Fraction fraction = new Fraction(denominator,numerator);
        return fraction;
    }

    /**
     * Simplifies the fraction
     *
     * @return new fraction
     */
    public Fraction simplify() {
        int a = numerator;
        int b = denominator;
        while (a % 2 == 0 && b % 2 == 0) {
            a /= 2;
            b/=2;
        }
        Fraction fraction = new Fraction(a,b);
        return fraction;
    }

    /**
     * Calculates the floating value of the fraction.
     *
     * @return float
     */
    public float toFloat() {
        return (float) (numerator / denominator);
    }
    //endregion


    //region: getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion
}
