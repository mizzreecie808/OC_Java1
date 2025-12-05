/*
In physics, a common useful equation for finding the position s of a body in
linear motion at a given time t, based on its initial position s0, initial velocity
v0, and rate of acceleration a, is the following:
s = s0 + v0 t + ½ at2
Write code to declare variables then write code to compute "s"
*/

public class C02E01_displacement {

  public static void main(String[] args) {

    double result = finalPosition();
    System.out.println(result);
  }

  public static double finalPosition() {
    double finalPosition;     // s - what we are solving for
    double initialPosition;   // s0
    double initialVelocity;   // v0
    double acceleration;      // a
    double duration;          // t

    initialPosition = 0.0;    // meters (m)
    initialVelocity = 15.0;   // (m/s)
    acceleration = -9.81;     // (m/s2)
    duration = 3.0;           // seconds (s)

    finalPosition = initialPosition + (initialVelocity * duration) + (0.5 * acceleration * duration * duration);

    return finalPosition;
  }
}
