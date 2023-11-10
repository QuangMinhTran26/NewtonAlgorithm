public class NewtonAlgorithm  {
    private Function function;
    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public double findRoot(Function function, double x){

        double result = 0;
        double guess = 0;
        boolean flag = true;

        x = x - function.calculateValue(x)/function.calculateDerivativeAtPoint(x);
        result += x;


//        while (true){
//
//            if (x < 0.0000001 || x > 5 || x < -5) break;
//
//        }

        return result;
    }

}
