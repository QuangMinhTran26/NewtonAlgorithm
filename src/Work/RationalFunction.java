package Work;

public class RationalFunction {

    public double externForRationalFunction(double[] Over, double[] Under, double x) {
        Function rUp = new Polynomial(Over);
        Function rDown = new Polynomial(Under);

        double resultOver = rUp.calculateDerivativeAtPoint(x) * rDown.calculateValue(x) - rUp.calculateValue(x) * rDown.calculateDerivativeAtPoint(x);
        double resultUnder = Math.pow(rDown.calculateValue(x), 2);
        double finalResult = 0;
        finalResult = resultOver / resultUnder;

        return finalResult;
    }


}
