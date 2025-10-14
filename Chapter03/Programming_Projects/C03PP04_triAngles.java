/*
Write a program that prompts for the lengths of the sides of a
triangle and reports the three angles.
*/
import java.util.Scanner;
public class C03PP04_triAngles {
  public static void main(String[] args) {

    // printIntro();
    // Scanner console = new Scanner(System.in);
    // triAngles(console);
    triAngles(5, 6, 10);

  }

  public static void printIntro() {
    IO.println("Lets compute the sides of a triangle.");
    IO.println("You will be prompted to enter the lengths of each side.");
  }

  public static void triAngles(Scanner console) {
    IO.print("Enter the first side (a): ");
    double aSide = console.nextDouble();
    IO.print("Enter the second side (b): ");
    double bSide = console.nextDouble();
    IO.print("Enter the third side (c): ");
    double cSide = console.nextDouble();

    double angleA = angle(aSide, bSide, cSide);
    double angleB = angle(bSide, aSide, cSide);
    double angleC = angle(cSide, aSide, bSide);
    IO.println("A = " + angleA);
    IO.println("B = " + angleB);
    IO.println("C = " + angleC);

  }

  public static void triAngles(double a, double b, double c) {
    // 1. Angle A (opposite side a): adj sides b & c
    double angleA = angle(a, b, c);

    // 2. Angle B (opposite side b): adj sides a & c
    double angleB = angle(b, a, c);

    // 3. Angle C (opposite side c): adj sides a & b
    double angleC = angle(c, a, b);
    IO.println("A = " + angleA);
    IO.println("B = " + angleB);
    IO.println("C = " + angleC);

  }

  public static double angle(double a, double b, double c) {
    // solve for A
    double top = (b * b) + (c * c) - (a * a);
    double bottom = 2 * b * c;
    double degrees = Math.toDegrees(Math.acos(top / bottom));
    return Math.round(degrees * 100.0) / 100.0;
  }
}
