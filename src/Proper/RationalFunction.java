package Proper;

public class RationalFunction implements Function {

    private Polynom f;
    private Polynom g;

    public RationalFunction(Polynom f, Polynom g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double calculateValue(double x) {
        return f.calculateValue(x) / g.calculateValue(x);
    }

    @Override
    // Derivative ist das englische Wort fuer Ableitung
    public double calculateDerivative(double x) {
        double fVonX = f.calculateValue(x);
        double fStrichVonX = f.calculateDerivative(x);
        double gVonX = g.calculateValue(x);
        double gStrichVonX = g.calculateDerivative(x);

        return ((fStrichVonX * gVonX) - (fVonX * gStrichVonX)) / Math.pow(gVonX, 2);
    }

}
