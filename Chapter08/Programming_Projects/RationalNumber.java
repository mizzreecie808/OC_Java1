/*
Represents a fraction with an integer numerator and denominator
Denominator != 0, this is enforced by the constructor
*/

public class RationalNumber {
  // private fields to hold the state of the fraction
  private int numerator;
  private int denominator;

  // -- CONSTRUCTORS --

  // construct a new rational number to represent the ration (num/den)
  public RationalNumber(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Denominator cannot be 0");
    }

    this.numerator = numerator;
    this.denominator = denominator;
  }

  // construct a new raional number to represent the ration (0/1)
  public RationalNumber() {
    this.numerator = 0;
    this.denominator = 1;
  }

  public int getNumerator() {
    return this.numerator;
  }

  public int getDenominator() {
    return this.denominator;
  }

  public String toString() {
    if (denominator == 1) {
      return "" + this.numerator;
    } else {
      return this.numerator + "/" + this.denominator;
    }
  }
}
