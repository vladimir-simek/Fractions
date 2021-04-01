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
     * @param other fraction
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        int a, b, c;
        a = MathUtils.findLowestCommonMultiple(denominator, other.denominator);

        b = numerator * (a / denominator);
        c = other.numerator * (a / other.denominator);

        return new Fraction((b + c), a);
    }

    /**
     * Subtracts other from the fraction. Returns a new fraction.
     *
     * @param other fraction
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        int a, b, c;
        a = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
        b = numerator * (a / denominator);
        c = other.numerator * (a / other.denominator);

        return new Fraction((b - c), a);
    }

    /**
     * Multiplies the two fractions. Returns a new fraction.
     *
     * @param other fraction
     * @return new fraction
     */

    public Fraction times(Fraction other) {
        return new Fraction((numerator * other.getNumerator()), (denominator * other.getDenominator()));
    }

    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     *
     * @param other fraction
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        Fraction second = other.getReciprocal();

        int a = numerator * second.getNumerator();
        int b = denominator * second.getDenominator();

        return new Fraction(a, b);
    }
    //endregion

    //region: other operations

    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     *
     * @return new fraction
     */
    public Fraction getReciprocal() {
        return new Fraction(denominator, numerator);
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
            b /= 2;
        }
        return new Fraction(a, b);
    }

    /**
     * Calculates the floating value of the fraction.
     *
     * @return float
     */
    public float toFloat() {
        return (float) numerator / (float) denominator;
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
