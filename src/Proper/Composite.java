package Proper;

public class Composite implements Function {

    public Function f;
    public Function g;

    public Composite(Function f, Function g) {
        this.g = g;
        this.f = f;

    }

    @Override
    public double calculateValue(double x) {
        double innerValue = this.g.calculateValue(x);
        double outerValue = this.f.calculateValue(innerValue);
        return outerValue;
    }

    @Override
    public double calculateDerivative(double x) {
        double innerDeriative = this.g.calculateDerivative(x);
        double outerDerivate = this.f.calculateDerivative(this.g.calculateValue(x));
        double compositeDerivative = innerDeriative * outerDerivate;

        return compositeDerivative;
    }
}
