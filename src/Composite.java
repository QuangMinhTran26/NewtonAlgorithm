public class Composite {

    public double composite(double[] outside, double[] inside, double x) {
        Function in = new Polynomial(inside);
        Function out = new Polynomial(outside);
        double resultInside = in.calculateDerivativeAtPoint(x);
        double resultOutside = 0;
        resultOutside = out.calculateDerivativeAtPoint(x) * resultInside;
        return resultOutside;
    }
}
