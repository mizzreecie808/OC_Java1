/*
Each BankAccount object represents one user's accont
Information including name and balance of money
*/

public class BankAccount {
  String name;
  double balance;
  double transactionFee = 0.00; // default value per textbook requirement

  // public BankAccount(String name, double balance) {
  //   this.name = name;
  //   this.balance = balance;
  // }

  public void deposit(double amount) {
    // no fees apply for deposits
    this.balance += amount;
  }

  public void withdraw(double amount) {

    // 1. calculate the total deduction
    double totalDeduction = amount + this.transactionFee;

    // 2. pre-condition check (is there enough money?)
    if (this.balance >= totalDeduction) {
      this.balance -= totalDeduction;
    }
    // if the check fails, balance remains unchanged
  }

  public void transfer(BankAccount other, double transferAmount) {
    final double TRANSFER_FEE = 5.00;

    // Rule: If amount is <= 0 OR balance is <= $5.00, do nothing (return)
    if (transferAmount <= 0 || this.balance < TRANSFER_FEE) {
      return;
    }

    // Calculate the amount available for transfer after fee is paid
    double availableToTransfer = this.balance - TRANSFER_FEE;

    // Determine actual amount to move
    double actualTransferAmount;

    // Rule: Full Transfer (If we can cover the requested amount)
    if (availableToTransfer >= transferAmount) {
      actualTransferAmount = transferAmount;
    }

    // Rule: Partial Transfer (Transfer whatever is left after the fee)
    else {
      actualTransferAmount = availableToTransfer;
    }

    // execute the transfer
    this.balance -= (actualTransferAmount + TRANSFER_FEE);

    // add the transfer amount to the other BankAccount
    other.balance += actualTransferAmount;
  }

  // Exercise 12
  public String toString() {
    return String.format("%s, $%.2f", this.name, this.balance);
  }
}
