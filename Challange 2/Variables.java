public class Variables {
    void loss() {
        double initialAmount;
        double finalAmount;
        double loss;

        initialAmount = 1000.0;
        System.out.println("Initial amount is: " + initialAmount);
        loss = 300.0;
        finalAmount = initialAmount - loss;
        System.out.println("Your final amount is: " + finalAmount);
    }

    public static void main(String[] args) {
        new Variables().loss();
    }
}
