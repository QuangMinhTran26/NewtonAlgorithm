public class Main {

    public static void main(String[] args){
        double[] factors = {1,-2,1};
        NewtonAlgorithm n = new NewtonAlgorithm();
        Function f = new Polynom(factors);
        double root = n.findRoot(f, 2);
        System.out.println(root);
    }
}
