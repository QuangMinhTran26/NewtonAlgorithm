public class Main {

    public static void main(String[] args){
        double[] factors = {1,-2,1};
        NewtonAlgorithm n = new NewtonAlgorithm();
        Polynomial fPolynomial = new Polynomial(factors);

        double root = n.findRoot(fPolynomial, 2);
        System.out.println(root);
        // Origin Newton Algorithm

        double[] over = {1,-1};
        double[] under = {1,1};
        RationalFunction fRational = new RationalFunction();
        double rFunction = fRational.externForRationalFunction(over, under, 2);
        System.out.print(rFunction);
        // Rational Function


    }
}
