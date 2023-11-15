package Work;

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
        System.out.print(rFunction);
        // Rational Function


    }
}
