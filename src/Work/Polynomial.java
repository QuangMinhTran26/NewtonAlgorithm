package Work;

import java.util.Arrays;

public class Polynomial implements Function {
    private double[] factors;

    public Polynomial(double[] factors) {
        setFactors(factors);
    }

    public double[] getFactors() {
        return factors;
    }

    public void setFactors(double[] factors) {
        this.factors = factors;
    }

    @Override
    public double calculateValue(double x) {
        int n = factors.length;
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += factors[i] * Math.pow(x, n - i - 1);
        }
        return result;
    }

    @Override
    public double calculateDerivativeAtPoint(double x) {
        int n = factors.length;
        double result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += (n - i - 1) * factors[i] * Math.pow(x, n - i - 2);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "factors=" + Arrays.toString(factors) +
                '}';
    }
}
