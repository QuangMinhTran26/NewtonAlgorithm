public class NewtonAlgorithm {


    public double findRoot(Function function, double x) {
        {
            for (int i = 0; i < 100; i++) {

                x = x - function.calculateValue(x) / function.calculateDerivativeAtPoint(x);
            }

        }

        return x;
    }

}
