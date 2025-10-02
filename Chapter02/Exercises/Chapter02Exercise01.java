/*
s = s0 + v0 t + ½ at2
Write code to declare variables then write code to compute "s"
*/

public class Chapter02Exercise01{
  public static void main(String[] args) {
    double finalPosition;          // s - what we are solving for
    double initialPosition;   // s0
    double initialVelocity;   // v0
    double acceleration;      // a
    double duration;          // t

    initialPosition = 0.0;    // meters (m)
    initialVelocity = 15.0;   // (m/s)
    acceleration = -9.81;     // (m/s2)
    duration = 3.0;           // seconds (s)

    finalPosition = initialPosition + (initialVelocity * duration) +
      (0.5 * acceleration * duration * duration);

    System.out.println(finalPosition);
  }
}
