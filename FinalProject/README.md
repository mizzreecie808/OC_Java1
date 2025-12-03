# Loan Comparison App

I just wanted to build a simple but expandable app to compare two different loan or investment products. The main goal is to figure out which loan is cheaper by calculating the Total Interest Paid for both package options and making a recommendation.

## Overview

I used an abstract class (BaseLoan) to define the "contract" for simple and compound interest loan, leaving room for possible future loan types. BaseLoan has two abstract methods that must be implemented by every loan type: calculateTotalInterest() and calculateTotalAmount().

The LoanComparisonApp uses the BaseLoan type to handle both SimpleInterestLoan and CompoundInterestLoan objects interchangeably.

## How to Run the Program

### Prerequisites
* JDK 8 or newer
* A terminal (Command Prompt, PowerShell, macOS Terminal, etc.)

### 1. Compile

Place all .java files in the same directory, then run:
'''bash
javac *.java

### 2. Execute
run:
java LoanComparisonApp

### 3. User Input and Validation
The UserInterface.java will provide prompts for enter two sets of loan parameters.
- **Principal**: must be greater than 0  
- **Annual Rate (%)**: must be 0 or greater  
- **Term (years)**: must be at least 1 year  
- **Compounding Frequency (n)**: must be 0 or greater  
  - Use `0` for simple interest  
  - Use values like `12` for monthly compounding, etc.

4. Output Example

The program prints the results using specific printf formatting to ensure the dollar amounts line up perfectly:

## Sample Input
```
Loan Simple    $10,000 // 5.0% // 10 years // n = 0
Loan Compound  $10,000 // 5.0% // 10 years // n = 12
```

## Sample Output

```
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
```

## License

This project is open source and distributed under the MIT License. See the included LICENSE.txt file for the full legal text.

(See LICENSE.txt)
https://opensource.org/license/mit

---

## References

This README was created with guidance from the following resources:

- [Markdown Guide](https://www.markdownguide.org/) – for Markdown syntax and formatting  
- [Markdown Live Editor](https://markdowncheatsheet.com/) – for writing README files
