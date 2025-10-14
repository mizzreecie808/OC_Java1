/*
A certain bank offers 6.5% interest on savings accounts, compounded annually.
Create a table that shows how much money a person will accumulate over a
period of 25 years, assuming that the person makes an initial investment
of $1000 and deposits $100 each year after the first. Your table should
indicate for each year the current balance, the interest, the new deposit,
and the new balance.
*/

public class C03PP02_savingsTable {
  public static void main(String[] args) {
    // interestEarned(1000.0);
    savingsTable(1000.0);

  }

  // method to print the header with proper spacing
  public static void printHeader() {
    IO.print(padded("YEAR", 5));
    IO.print(padded("CURRENT BALANCE", 16));
    IO.print(padded("INTEREST", 9));
    IO.print(padded("NEW DEPOSIT", 12));
    IO.println(padded("NEW BALANCE", 12) + "|");
  }

  public static void savingsTable(double startingBalance) {
    printHeader();
    double currBalance = startingBalance;
    double newDeposit = 100.0;
    for (int year = 1; year <=25; year++) {
      double interest = interestEarned(currBalance);

      // used String.valueOf() to print year as a whole number
      IO.print(padded(String.valueOf(year), 5));
      IO.print(padded(twoZeroes(currBalance), 16));

      IO.print(padded(twoZeroes(interest), 9));
      IO.print(padded(newDeposit, 12));
      currBalance = currBalance + interest + newDeposit;
      IO.println(padded(twoZeroes(currBalance), 12) + "|");
    }
  }

  // overload method from chapter to pad the table lines
  public static String padded(double num, int width) {
    String s = "" + num;
    for (int i = s.length(); i < width - 1; i++) {
        s = " " + s;
    }
    return "| " + s + " ";
  }

  // overload method from chapter to pad the table header
  public static String padded(String word, int width) {
    for (int i = word.length(); i < width - 1; i++) {
        word = " " + word;
    }
    return "| " + word + " ";
  }

  // method to round doubles to 2 digits
  public static double twoZeroes(double amount) {
    return Math.round(amount * 100.0) / 100.0;
  }

  // method to caluclate the interest earned
  public static double interestEarned(double currBalance) {
    double rate = 0.065;
    return currBalance * rate;
  }
}
