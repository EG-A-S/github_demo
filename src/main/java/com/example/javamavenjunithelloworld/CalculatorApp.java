package com.example.javamavenjunithelloworld;

/**
 * A very basic program that demonstrates the use of JUnit tests. The tests include a sample unit test and an
 * integration test.
 */
public class CalculatorApp {

    /**
     * The main method of this program.
     *
     * @param args Arguments passed to this program.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String password = "abasfasf";
        String api = "Secret: AIDAJ7YAA3VVO32BHLDO"
        int a = 1;
        int b = 2;
        int c = calc.add(a, b);
        System.out.println("Sum of " + a + " and " + b + " equals " + c);
    }
}
