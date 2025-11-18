/**
 * 8.5 Case Study: Designing a Stock Class
 * ---------------------------------------
 * Prompt the user for each stock's symbol
 * Prompt the user for the number of purchases of each stock
 * Read each purchase from the console and store the information somewhere
 * Print the total profit/loss of each stock
 * Compare the two total profits/losses and print a message to the console about
 * which stock perfromed better
 *
 */

public class StockMain {
  public static void main(String[] args) {
    System.out.println("--- 1. Initial State and Purchase Tests ---");

    // Create a new Stock object (Symbol: MSFT)
    Stock msft = new Stock("MSFT");

    // Initial State (Should use the toString() method)
    System.out.println("Initial MSFT: " + msft);
    // Expected: MSFT: 0 shares (Total cost: $0.00)

    // Purchase 1: 50 shares @ $300.00
    msft.purchase(50, 300.00);
    System.out.println("After P1: " + msft);
    // Expected total cost: 50 * 300 = $15,000.00
    // Expected output: MSFT: 50 shares (Total cost: $15,000.00)

    // Purchase 2: 100 shares @ $320.00
    msft.purchase(100, 320.00);
    // Expected total shares: 50 + 100 = 150
    // Expected cost: 15000.00 + (100 * 320.00) = 15000.00 + 32000.00 = $47,000.00
    System.out.println("After P2: " + msft);
    // Expected output: MSFT: 150 shares (Total cost: $47,000.00)
    System.out.println("----------------------------------------\n");


    // --- 2. Profit Calculation Test ---
    System.out.println("--- 2. Profit Calculation Test ---");

    // Scenario A: Profit (Current price > Avg cost)
    double currentPriceA = 350.00;
    double profitA = msft.getProfit(currentPriceA);
    // Market Value: 150 * 350.00 = 52,500.00
    // Profit: 52,500.00 - 47,000.00 = 5,500.00
    System.out.printf("Current Price: $%.2f. Profit: $%.2f\n", currentPriceA, profitA);
    // Expected: Profit: $5,500.00

    // Scenario B: Loss (Current price < Avg cost)
    double currentPriceB = 250.00;
    double profitB = msft.getProfit(currentPriceB);
    // Market Value: 150 * 250.00 = 37,500.00
    // Profit: 37,500.00 - 47,000.00 = -9,500.00
    System.out.printf("Current Price: $%.2f. Loss: $%.2f\n", currentPriceB, profitB);
    // Expected: Loss: $-9,500.00
    System.out.println("----------------------------------------\n");


    // --- 3. Clear Method Test ---
    System.out.println("--- 3. Clear Method Test ---");

    System.out.println("MSFT Before Clear: " + msft);
    msft.clear();
    System.out.println("MSFT After Clear: " + msft);
    // Expected output: MSFT: 0 shares (Total cost: $0.00)

    // Test Reuse after Clear
    msft.purchase(10, 100.00);
    System.out.println("MSFT After New Purchase: " + msft);
    // Expected output: MSFT: 10 shares (Total cost: $1,000.00)
    System.out.println("----------------------------------------\n");


    // --- 4. Testing Input Validation (Exceptions) ---
    System.out.println("--- 4. Testing Input Validation (Exceptions) ---");

    Stock goog = new Stock("GOOG");
    try {
        // Attempt to purchase negative shares (should throw exception)
        goog.purchase(-5, 100.00);
    } catch (IllegalArgumentException e) {
        System.out.println("Validation Error Caught: " + e.getMessage());
    }

    try {
        // Attempt to calculate profit with negative price (should throw exception)
        goog.getProfit(-1.0);
    } catch (IllegalArgumentException e) {
        System.out.println("Validation Error Caught: " + e.getMessage());
    }
  }
}
