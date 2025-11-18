/**
 * 8.5 Case Study: Designing a Stock Class
 * ---------------------------------------
 * Store stock's symbol
 * Store accumulated information about the investor's purchases of the stock
 * Record a purchase of the stock
 * Compute the total profit/loss for the stock
 *
 */

public class Stock {

  // Core Fields (State)
  private String symbol;  // should make final
  private int totalShares;
  private double totalCost;

  // Constructor: Initializes a new Stock with no shares purchased
  public Stock(String theSymbol) {
    // validate that the input is not null
    if (theSymbol == null) {
      throw new NullPointerException("Stock symbol cannot be null.");
    }
    this.symbol = theSymbol;
    this.totalShares = 0;
    this.totalCost = 0.0;
  }

  // -- ACCESSORS --
  // Returns the ticker symbol for this stock.
  public String getSymbol() {
    return this.symbol;
  }

  // Returns the total number of shares purchased.
  public int getTotalShares() {
    return this.totalShares;
  }

  // Returns the total amount spent on purchasing this stock.
  public double getTotalCost() {
    return this.totalCost;
  }

  // -- MUTATORS & CALCULATORS --
  // record information about a single purchase of stock
  public void purchase(int shares, double pricePerShare) {
    // validate shares and pricePerShare are not negative
    if (shares < 0 || pricePerShare < 0) {
      throw new IllegalArgumentException("Shares and price per share must be non-negative.");
    }

    this.totalShares += shares;
    this.totalCost += shares * pricePerShare;

  }

  public double getProfit(double currentPrice) {
    if (currentPrice < 0.0) {
      throw new IllegalArgumentException("Current price cannot be negative.");
    }
    double marketValue = this.totalShares * currentPrice;
    return marketValue - this.totalCost;
  }

  public void clear() {
    this.totalShares = 0;
    this.totalCost = 0.0;
  }

  public String toString() {
    // Format the totalCost as currency (two decimal places)
    String costString = String.format("$%.2f", this.totalCost);
    String toPrint = String.format("%s: %d shares (Total cost: %s)",
      this.symbol,
       this.totalShares,
       costString);
    return toPrint;
  }
}
