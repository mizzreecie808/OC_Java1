/*
Write a method called priceIsRight that mimics the guessing rules from the game show
The Price Is Right. The method accepts as parameters an array of integers representing
the contestants’ bids and an integer representing a correct price. The method returns
the element in the bids array that is closest in value to the correct price without
being larger than that price.
*/
import java.util.Arrays;

public class C07E12_priceIsRight {
  public static void main(String[] args) {

    // Test Case 1: Standard closest bid (250 is closest to 280 without going over)
    int[] bids1 = {200, 300, 250, 1, 950, 40};
    int actualPrice1 = 280;
    System.out.println("--- Test Case 1 ---");
    System.out.println("Bids: " + Arrays.toString(bids1) + ", Price: " + actualPrice1);
    System.out.println("Winning Bid (Expected: 250): " + priceIsRight(bids1, actualPrice1));

    // Test Case 2: All bids are over (Expected: -1)
    int[] bids2 = {500, 600, 700};
    int actualPrice2 = 400;
    System.out.println("\n--- Test Case 2 (All Over) ---");
    System.out.println("Bids: " + Arrays.toString(bids2) + ", Price: " + actualPrice2);
    System.out.println("Winning Bid (Expected: -1): " + priceIsRight(bids2, actualPrice2));

    // Test Case 3: Exact bid (Expected: 100)
    int[] bids3 = {10, 100, 99};
    int actualPrice3 = 100;
    System.out.println("\n--- Test Case 3 (Exact Bid) ---");
    System.out.println("Bids: " + Arrays.toString(bids3) + ", Price: " + actualPrice3);
    System.out.println("Winning Bid (Expected: 100): " + priceIsRight(bids3, actualPrice3));
  }

  public static int priceIsRight(int[] contestants, int price) {

    // serves as a sentinel value to indicate no valid bid found yet
    int winningBid = -1;

    // we want the smallest difference (price - bid)
    int leastDifference = price + 1;

    // int overPrice = 0;

    for (int currentBid : contestants) {
      // 1. bid must be less than or equal to correct price
      if (currentBid <= price) {

        // calculate the difference
        int currentDifference = price - currentBid;

        // 2. check is bid closer than the best one
        if (currentDifference < leastDifference) {
          leastDifference = currentDifference;
          winningBid = currentBid;
        }
      }
    }

    // if no valid bid was made, -1 will return
    return winningBid;
  }
}
