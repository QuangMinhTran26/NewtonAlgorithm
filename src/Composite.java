public class Composite {

    public double composite(double[] outside, double[] inside, double x) {
        Polynomial in = new Polynomial(inside);
        Polynomial out = new Polynomial(outside);
        double resultInside = in.calculateDerivativeAtPoint(x);
        double resultOutside = 0;
        resultOutside = Math.pow(in.calculateValue(x), outside.length - 2) * resultInside * (outside.length - 1);
        return resultOutside;
    }
}
