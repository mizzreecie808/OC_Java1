/*
Write a method called printFactors that accepts an integer as its parameter and uses a
fencepost loop to print the factors of that number, separated by the word "and".
printFactors(24):
1 and 2 and 3 and 4 and 6 and 8 and 12 and 24
You may assume that the parameter’s value is greater than 0, or you may throw an
exception if it is 0 or negative.
*/

public class C05E09_printFactors {
  public static void main(String[] args) {

    printFactors(24);

  }

  public static void printFactors(int num) {

    if (num <= 0) {
      throw new IllegalArgumentException("Number must be positive and greater than 0.");
    }

    IO.print(1);
    int factor = 2;
    while (factor < num) {
      if (num % factor == 0) {
        IO.print(" and " + factor);
      }
      factor++;
    }
  }
}
