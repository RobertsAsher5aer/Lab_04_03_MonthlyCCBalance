public class Main {

    // Creates a constant for our interest rate
    private static final double INTEREST_RATE = 0.17;

    public static void main(String[] args) {

        // Initializes the initial CC balance
        double initialBalance = 5000.0;
        // Computes the interest due after 1 month
        double interest1 = initialBalance * INTEREST_RATE;
        // Outputs this value to the console
        System.out.println(" ");
        System.out.println("With an interest rate of 17%, the interest due after 1 month is: " + interest1);

        // Computing for month 2
        double updatedBalance = initialBalance + interest1;
        double interest2 = updatedBalance * INTEREST_RATE;
        // Output to the console
        System.out.println(" ");
        System.out.println("With an interest rate of 17%, the interest due after 2 months is: " + interest2);


    }
}
