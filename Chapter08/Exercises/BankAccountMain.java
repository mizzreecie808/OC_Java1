// This client program tests the functionality of the BankAccount class.
public class BankAccountMain {
    public static void main(String[] args) {
        // --- Test Scenario from Textbook Examples ---
        System.out.println("--- Test Scenario: Textbook Examples ---");

        // Uses the no-argument constructor we added back in
        BankAccount ben = new BankAccount();
        ben.name = "Ben"; // Manually set name since no-arg constructor uses "Unnamed Account"
        ben.deposit(80.00);

        BankAccount hal = new BankAccount();
        hal.name = "Hal"; // Manually set name
        hal.deposit(20.00);

        System.out.println("Initial Ben: " + ben); // Expected: Ben, $80.00
        System.out.println("Initial Hal: " + hal); // Expected: Hal, $20.00
        System.out.println("----------------------------------------\n");


        // 1. ben.transfer(hal, 20.00);
        // Ben's balance: 80.00. Total needed: 20.00 + 5.00 = 25.00. (Full Transfer)
        ben.transfer(hal, 20.00);
        // Ben: 80.00 - 25.00 = 55.00
        // Hal: 20.00 + 20.00 = 40.00
        System.out.println("After Transfer 1 ($20.00):");
        System.out.println("Ben: " + ben); // Expected: Ben, $55.00
        System.out.println("Hal: " + hal); // Expected: Hal, $40.00
        System.out.println("----------------------------------------\n");


        // 2. ben.transfer(hal, 10.00);
        // Ben's balance: 55.00. Total needed: 10.00 + 5.00 = 15.00. (Full Transfer)
        ben.transfer(hal, 10.00);
        // Ben: 55.00 - 15.00 = 40.00
        // Hal: 40.00 + 10.00 = 50.00
        System.out.println("After Transfer 2 ($10.00):");
        System.out.println("Ben: " + ben); // Expected: Ben, $40.00
        System.out.println("Hal: " + hal); // Expected: Hal, $50.00
        System.out.println("----------------------------------------\n");


        // 3. hal.transfer(ben, 60.00);
        // Hal's balance: 50.00. Total needed: 60.00 + 5.00 = 65.00. (Partial Transfer needed)
        // Available to transfer after $5 fee: 50.00 - 5.00 = 45.00
        hal.transfer(ben, 60.00);
        // Hal: 50.00 - (45.00 + 5.00) = 0.00
        // Ben: 40.00 + 45.00 = 85.00
        System.out.println("After Transfer 3 ($60.00 request, $45.00 sent):");
        System.out.println("Ben: " + ben); // Expected: Ben, $85.00
        System.out.println("Hal: " + hal); // Expected: Hal, $0.00
        System.out.println("----------------------------------------\n");
    }
}
