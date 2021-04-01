package cz.educanet;

public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(66, 20);
        Fraction fraction1 = fraction.simplify();
        System.out.println(fraction1.getNumerator() + "" + fraction1.getDenominator());
    }


}
