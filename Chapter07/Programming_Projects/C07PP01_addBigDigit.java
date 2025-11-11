/*
Java’s type int has a limit on how large an integer it can store. This limit can be
circumvented by representing an integer as an array of digits. Write an interactive
program that adds two integers of up to 50 digits each.
*/

import java.util.Arrays;

public class C07PP01_addBigDigit {

  public static void main(String[] args) {

    String a = "456789012345";
    String b = "987654321";
    String answer = "457776666666";
    String result = addBigDigit(a, b);
    IO.println("--- Testing addBigDigit() ---");
    if (answer.equals(result)) {
      IO.println("Passed");
    } else {
      IO.println("Failed");
      IO.println("Correct answer: " + answer);
      IO.println("Your answer:    " + result);
    }
  }

  public static String addBigDigit(String bigOne, String bigTwo) {

    // convert to arrays
    int[] arrA_converted = convertString(bigOne);
    int[] arrB_converted = convertString(bigTwo);

    // reverse arrays
    int[] arrA_reversed = reverseToNewArray(arrA_converted);
    int[] arrB_reversed = reverseToNewArray(arrB_converted);

    // get lengths of both arrays
    int aLen = arrA_reversed.length;
    int bLen = arrB_reversed.length;

    // initialize variables
    int maxLength = Math.max(aLen, bLen);
    int[] sum = new int[maxLength + 1];
    int carry = 0;

    for (int i = 0; i < maxLength; i++) {

      // logic for arrayA
      int digitA = 0;
      if (i < aLen) {
        digitA = arrA_reversed[i];
      }

      // logic for arrayB
      int digitB = 0;
      if (i < bLen) {
        digitB = arrB_reversed[i];
      }

      int digitSum = digitA + digitB + carry;
      int ones = digitSum % 10;
      carry = digitSum / 10;
      sum[i] = ones;
    }

    if (carry > 0) {
      sum[maxLength] = carry;
    }

    return arrayToBigString(reverseToNewArray(sum));
  }

  public static String arrayToBigString(int[] finalDigits) {
    // initialize the builder
    StringBuilder resultBuilder = new StringBuilder();
    int firstDigitIndex = 0;

    // skip leading zeroes
    while (firstDigitIndex < finalDigits.length - 1 && finalDigits[firstDigitIndex] == 0) {
      firstDigitIndex++;
    }

    // append all significant digits
    for (int i = firstDigitIndex; i < finalDigits.length; i++) {
      resultBuilder.append(finalDigits[i]);
    }

    if (resultBuilder.length() == 0) {
      return "0";
    }
    return resultBuilder.toString();
  }

  public static int[] convertString(String str) {

    int[] result = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      result[i] = str.charAt(i) - '0';
    }
    return result;
  }

  public static int[] reverseToNewArray(int[] original) {

    int length = original.length;
    int[] newArray = new int[length];

    for (int i = 0; i < length; i++) {
      // source index i maps to destination index (length - 1 - i)
      newArray[i] = original[length - 1 - i];
    }
    return newArray;
  }
}
