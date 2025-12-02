# Loan Comparison App

I just wanted to build a simple but expandable app to compare two different loan or investment products. The main goal is to figure out which loan is cheaper by calculating the Total Interest Paid for both package options and making a recommendation.

I used an abstract class (BaseLoan) to define the "contract" for simple and compound interest loan, leaving room for possible future loan types. BaseLoan has two abstract methods that must be implemented by every loan type: calculateTotalInterest() and calculateTotalAmount().

The LoanComparisonApp uses the BaseLoan type to handle both SimpleInterestLoan and CompoundInterestLoan objects interchangeably.

## How to Run the Program
This is a standard Java application that runs via the terminal.

### Prerequisites
Java Development Kit (JDK) installed (Java 8 or newer).
A command-line terminal (like Command Prompt, PowerShell, or Terminal).

1. Compilation

- First, make sure all six .java files are in one directory. Then, compile them using the Java compiler (javac):
- javac *.java: This generates the necessary compiled .class files.

2. Execution
- Run the main driver class, LoanComparisonApp: java LoanComparisonApp

3. User Input & Validation
The UserInterface.java will provide prompts for enter two sets of loan parameters.
- Principal
  - Enter Loan Principal ($)
  - Principal must be a positive amount
- Annual Rate
  - Enter Annual Interest Rate (e.g. 5 for 5%)
  - Rate must be positive or zero.
- Term
  - Enter Loan Term (in full years):
  - Term must be at least 1 year.
- Compounding Frequency
  - Enter Compound Frequency (n): (e.g. 12 for Monthly, or 0 if simple interest loan):
  - Frequency must be positive number or zero.

4. Output Example

The program prints the results using specific printf formatting to ensure the dollar amounts line up perfectly:

Loan Simple    $10,000 // 5.0% // 10 years // n = 0
Loan Compound  $10,000 // 5.0% // 10 years // n = 12


------------------------------------
Loan Name: Simple
  Total Interest Paid:         $    5,000.00
  Total Principal & Interest:  $   15,000.00
------------------------------------
Loan Name: Compound
  Total Interest Paid:         $    6,470.09
  Total Principal & Interest:  $   16,470.09

--- Recommendation ---
The better loan is: Simple
Interest paid for Simple ($5,000.00) is less than for Compound ($6,470.09).

## License

This project is open source and distributed under the MIT License. See the included LICENSE.txt file for the full legal text.

(See LICENSE.txt)
https://opensource.org/license/mit
