public class NewtonAlgorithm  {
    private Function function;

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public double findRoot(Function function, double x){

        x = x - function.calculateValue(x)/function.calculateDerivativeAtPoint(x);

        return x;
    }

}
