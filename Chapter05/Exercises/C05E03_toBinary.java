/*
Write a method called toBinary that accepts an integer as a parameter and returns a String
containing that integer’s binary representation.
printBinary(44) should return "101100"
*/
public class C05E03_toBinary {
  public static void main(String[] args) {

    IO.println(printBinary(44));
    IO.println("101100");

  }

  public static String printBinary(int num) {

    // handle edge case where the input is 0
    if (num == 0) {
      return "0";
    }

    int currNum = num;
    String bin = "";

    while (currNum > 0) {
      // calculate the remainder (next binary digit: 0 or 1)
      int binNum = currNum % 2;

      // update the iteration for the next
      currNum /= 2;

      // pre-pend the new digit to the string to keep the correct order
      bin = binNum + bin;
    }
    return bin;
  }
}
