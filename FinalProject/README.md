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

First, make sure all six .java files are in one directory. Then, compile them using the Java compiler (javac):

javac *.java

This generates the necessary compiled .class files.

2. Execution

Run the main driver class, LoanComparisonApp:

java LoanComparisonApp

3. User Input & Validation

The UserInterface.java (my input handler!) will guide you through entering two sets of loan parameters. Remember these key points for input:

Parameter

What to Enter

Note (from the code)

P (Principal)

A positive number.

"Error: Principal must be a positive amount."

R (Annual Rate)

Rate as a percentage (e.g., 5.0).

"Error: Rate must be positive or zero."

T (Term)

Duration in full years.

"Error: Term must be at least 1 year."

n (Frequency)

Compounding Frequency.

"0 if Simple Interest Loan."

4. Output Example

The program prints the results using specific printf formatting to ensure the dollar amounts line up perfectly:

--- Loan Comparison Results ---
------------------------------------
Loan Name: Simple Savings Bond
  Total Interest Paid:          $5,000.00
  Total Principal & Interest:  $15,000.00


## License

This project is open source and distributed under the MIT License. See the included LICENSE.txt file for the full legal text.

(See LICENSE.txt)
https://opensource.org/license/mit
