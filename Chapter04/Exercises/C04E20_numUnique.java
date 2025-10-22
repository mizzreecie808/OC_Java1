/*
Write a method called numUnique that takes three integers as parameters and returns
the number of unique integers among the three.
numUnique(18, 3, 4) should return 3 because the parameters have three different values.
numUnique(6, 7, 6) should return 2 because there are only two unique numbers
among the three parameters: 6 and 7.
*/
public class C04E20_numUnique {
  public static void main(String[] args) {

    numUnique(18, 3, 4);
    numUnique(6, 7, 6);

  }

  public static int numUnique(int a, int b, int c) {
    int unique;
    if (a == b && b == c) {
      unique = 1;
    } else if (a == b || b == c || c == a) {
      unique = 2;
    } else {
      unique = 3;
    }
    IO.println(unique);
    return unique;
  }
}
