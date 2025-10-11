/*
Write a method called cylinderSurfaceArea that accepts a radius and height
as parameters and returns the surface area of a cylinder with those dimensions.
cylinderSurfaceArea(3.0, 4.5) should return 141.3716694115407
2*PI*PI + 2PIrh
*/


public class C03E14_cylinderSurfaceArea {
  public static void main(String[] args) {

    cylinderSurfaceArea(3.0, 4.5);

  }

  public static double cylinderSurfaceArea(double radius, double height) {
    double surfaceArea = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    IO.println(surfaceArea);
    return surfaceArea;
  }
}
