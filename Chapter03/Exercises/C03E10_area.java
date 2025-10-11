/*
Write a method called area that accepts as a parameter the radius of a
circle and that returns the area of the circle
area(2.0) should return 12.566370614359172.
Recall that area can be computed as PI * r * r
*/
public class C03E10_area {
  public static void main(String[] args) {
    area(2.0);
  }

  public static double area(double radius) {
    // System.out.println(Math.PI * radius * radius);
    return Math.PI * radius * radius;
  }
}
