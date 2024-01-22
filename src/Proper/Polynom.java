package Proper;

public class Polynom implements Function {

    private double[] factors;

    public Polynom(double[] factors) {
        this.factors = factors;
    }

    @Override
    public double calculateValue(double x) {
        double result = 0;

        for (int i = 0; i < factors.length; i++) {
            double factor = factors[i];
            result += factor * Math.pow(x, factors.length - 1 - i);
        }

        return result;
    }

    @Override
    public double calculateDerivative(double x) {
        /*double result = 0;

        for (int i = 0; i < factors.length - 1; i++) {
            double factor = factors[i];
            result += factor * (factors.length - 1 - i) * Math.pow(x, factors.length - 2 - i);
        }

        return result;*/
        double[] newFactors = new double[factors.length - 1];
        for (int i = 0; i < newFactors.length; i++) {
            newFactors[i] = factors[i] * (factors.length - 1 - i);
        }

        Polynom derivative = new Polynom(newFactors);

        return derivative.calculateValue(x);
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < factors.length; i++) {
            double factor = factors[i];
            result += factor + " * x^" + (factors.length - 1 - i) + " + ";
        }

        return result.substring(0, result.length() - 2);
    }
}
