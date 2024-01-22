package Proper;

public class Main {

    public static void main(String[] args) {
        double[] functionParams = {3, -523, 14, 4, 3, 2, 4};
        Polynom polynom = new Polynom(functionParams);
        NewtonAlgorithm newtonAlgorithm = new NewtonAlgorithm();

        double value = polynom.calculateDerivative(0);
        System.out.println(polynom);
        System.out.print(newtonAlgorithm.findRoot(polynom, 100));

        // Implementierung von Composite fehlt noch
    }

}
