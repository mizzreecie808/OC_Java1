/*
Write a method called triangleArea that accepts the three side lengths of a
triangle as parameters and returns the area of a triangle with those side
lengths.
triangleArea(8, 5.2, 7.1) should return 18.151176098258745.
To compute the area, use Heron’s formula, which states that the area of
a triangle whose three sides have lengths (a, b, c)
area = √s(s-a)(s-b)(s-c)
s = (a+b+c) / 2
*/


public class C03E16_triangleArea {
  public static void main(String[] args) {

    triangleArea(8, 5.2, 7.1);

  }

  public static double triangleArea(double a, double b, double c) {
    double s = (a + b + c) / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    IO.println(area);
    return area;
  }
}
