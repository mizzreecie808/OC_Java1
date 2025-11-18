/*
A program that deals with points.
First version, to accompany Point class with state only
*/

public class PointMain {
  public static void main(String[] args) {

    // --- INITIALIZE TEST POINTS (used across all tests) ---
    Point p1 = new Point(5, 10);    // Quadrant 1
    Point p2 = new Point(-5, 10);   // Quadrant 2
    Point p3 = new Point(-5, -10);  // Quadrant 3
    Point p4 = new Point(5, -10);   // Quadrant 4 (will be modified by flip())
    Point p5 = new Point(0, 7);     // Y-Axis
    Point p6 = new Point(0, 0);     // Origin

    System.out.println("--- 1. Testing quadrant() Method ---");
    System.out.println("P1 " + p1 + " is in Quadrant: " + p1.quadrant());
    System.out.println("P2 " + p2 + " is in Quadrant: " + p2.quadrant());
    System.out.println("P3 " + p3 + " is in Quadrant: " + p3.quadrant());
    System.out.println("P4 " + p4 + " is in Quadrant: " + p4.quadrant());
    System.out.println("P5 " + p5 + " is in Quadrant: " + p5.quadrant());
    System.out.println("P6 " + p6 + " is in Quadrant: " + p6.quadrant());

    // -------------------------------------------------------------

    System.out.println("\n--- 2. Testing flip() Mutator Method ---");
    // Initial state of P4: (5, -10)
    p4.flip(); // Should become (10, -5)
    System.out.println("P4 after flip() is: " + p4.toString() + " (Expected: (10, -5))");

    // -------------------------------------------------------------

    System.out.println("\n--- 3. Testing manhattanDistance() Method ---");
    // Test: P3 (-5, -10) to P5 (0, 7)
    // Expected: |0 - (-5)| + |7 - (-10)| = 5 + 17 = 22
    int dist = p3.manhattanDistance(p5);
    System.out.println("Distance P3" + p3 + " to P5" + p5 + " is: " + dist + " (Expected: 22)");

    // -------------------------------------------------------------

    System.out.println("\n--- 4. Testing isVertical() Method ---");
    // Test 1 (TRUE): P2 (-5, 10) and P3 (-5, -10) -> Same X
    boolean testTrue = p2.isVertical(p3);
    System.out.println("P2" + p2 + " and P3" + p3 + " are vertical: " + testTrue + " (Expected: true)");

    // Test 2 (FALSE): P2 (-5, 10) and P4 (10, -5) -> Different X
    boolean testFalse = p2.isVertical(p4);
    System.out.println("P2" + p2 + " and P4" + p4 + " are vertical: " + testFalse + " (Expected: false)");

    // -------------------------------------------------------------

    System.out.println("\n--- 5. Testing slope() Method ---");

    // Test A: Positive Slope (P3 to P1) | Expected: 2.0
    double slopeA = p3.slope(p1);
    System.out.println("Slope P3" + p3 + " to P1" + p1 + " = " + slopeA);

    // Test B: Negative Slope (P2 to P4) | Expected: -2.0
    double slopeB = p2.slope(p4);
    System.out.println("Slope P2" + p2 + " to P4" + p4 + " = " + slopeB);

    // Test C: Zero Slope (Horizontal Line)
    Point p7 = new Point(10, 10); // New Point
    // P1(5, 10) to P7(10, 10) | Expected: 0.0
    double slopeC = p1.slope(p7);
    System.out.println("Slope P1" + p1 + " to P7" + p7 + " = " + slopeC + " (Expected: 0.0)");

    // Test D: Vertical Slope (Throws Exception)
    Point p8 = new Point(5, 50); // New Point

    System.out.print("Testing Vertical Line P1" + p1 + " to P8" + p8 + "... ");
    try {
        p1.slope(p8);
        System.out.println("FAIL (Did not throw exception)");
    } catch (IllegalArgumentException e) {
        System.out.println("SUCCESS: Exception caught (" + e.getMessage() + ")");
        }
  }
}
