/*
Write the method called printTriangleType referred to in Self-Check Problem 25.
This method accepts three integer arguments representing the lengths of the sides of a
triangle and prints the type of triangle that these sides form.
Your method should throw an IllegalArgumentException if passed invalid values, such as
ones where one side’s length is longer than the sum of the other two, which is impossible
in a triangle. For example, the call of printTriangleType(2, 18, 2); should throw an
exception.
*/

public class C04E12_printTriangleType {
  public static void main(String[] args) {

    printTriangleType(5, 7, 7);
    printTriangleType(6, 6, 6);
    printTriangleType(5, 7, 8);
    printTriangleType(2, 18, 2);

  }

  // 4.18 wordCount Error on invalid parameter
  public static void printTriangleType(int a, int b, int c) {

    // triangle inequality theorem
    if (a + b < c || a + c < b || b + c < a) {
      throw new IllegalArgumentException("Sides do not satisfy the triangle inequality theorem");
    }

    if (a == b && b == c) {
      IO.println("equilateral");
    } else if (a == b || a == c || b == c) {
      IO.println("isosceles");
    } else {
      IO.println("scalene");
    }
  }
}
