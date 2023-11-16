public class Main {

    public static void main(String[] args) {
        double[] factors = {1, -2, 1};
        NewtonAlgorithm newton = new NewtonAlgorithm();
        Polynomial fPolynomial = new Polynomial(factors);

        double root = newton.findRoot(fPolynomial, 2);
        System.out.println(root);
        // Origin Newton Algorithm

        double[] over = {1, -1};
        double[] under = {1, 1};
        RationalFunction rational = new RationalFunction();
        double rFunction = rational.externForRationalFunction(over, under, 2);
        System.out.println(rFunction);
        // Rational Function


        double[] inside = {5, 2};
        double[] outside = {1, 0, 0, 0};
        Composite composite = new Composite();
        double cFunction = composite.composite(outside, inside, 1);
        System.out.println(cFunction);

    }
}
