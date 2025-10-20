/*
Write a method called quadrant that accepts as parameters a pair of double
values representing an (x, y) point and returns the quadrant number for
that point. Recall that quadrants are numbered as integers from 1 to 4 with
the upper-right quadrant numbered 1 and the subsequent quadrants numbered in
a counterclockwise fashion:
*/

public class C04E19_quadrant {
  public static void main(String[] args) {

    IO.println(quadrant(-2.3, 3.5));  // 2
    IO.println(quadrant(4.5, -4.5)); // 4

  }

  // 4.19 wordCount Error on invalid parameter
  public static int quadrant(double x, double y) {

    // check if x or y is at the origin
    if (x == 0.0 || y == 0.0) {
      return 0;
    }
    // check for positive x value, quads 1 & 4
    if (x > 0) {
      // positive y value = quad 1
      if (y > 0) {
        return 1;
      } else {
        return 4;
      }
    // check for negative x value, quads 2 & 3
    } else {
      // positive y value = quad 3
      if (y > 0) {
        return 2;
      } else {
        return 3;
      }
    }
  }
}
