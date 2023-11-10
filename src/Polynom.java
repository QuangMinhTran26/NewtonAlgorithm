public class Polynom implements Function {
    private double[] factors;

    public double[] getFactors(){
        return factors;
    }

    public void setFactors(double[] factors){
        this.factors = factors;
    }

    @Override
    public double calculateValue(double x) {
        int n = factors.length;
        double result = 0;
        for (int i = 0; i < n; i++){
            result += factors[i]*Math.pow(x,n-i-1);
        }
        return result;
    }

    @Override
    public double calculateDerivativeAtPoint(double x) {
        return 0;
    }
}
