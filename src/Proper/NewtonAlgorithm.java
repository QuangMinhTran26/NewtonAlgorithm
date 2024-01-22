package Proper;

public class NewtonAlgorithm {

    public double findRoot(Function f, double x) {
        for (int i = 0; i < 100; i++) {
            x = x - (f.calculateValue(x) / f.calculateDerivative(x));
        }

        return x;
    }

}
