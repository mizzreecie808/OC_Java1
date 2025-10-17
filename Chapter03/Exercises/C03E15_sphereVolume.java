/*
Write a method called sphereVolume that accepts a radius as a parameter
and returns the volume of a sphere with that radius.
sphereVolume(2.0) should return 33.510321638291124
volume = 4 / 3 PI r^3
*/


public class C03E15_sphereVolume {
  public static void main(String[] args) {

    sphereVolume(2.0);

  }

  public static double sphereVolume(double radius) {
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    IO.println(volume);
    return volume;
  }
}
