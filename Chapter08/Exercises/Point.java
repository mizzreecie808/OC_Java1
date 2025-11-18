public class Point {
  // Fields (state)
  private int x;
  private int y;

  // CONSTRUCTORS:
  // default constructor for origin
  public Point() {
    // Constructor chaining: calls the parameterized constructor
    this(0, 0);
  }

  // CONSTRUCTOR: constrcuts a new point with the given (x, y) location
  public Point(int x, int y) {
    setLocation(x, y);
  }

  // --- ACCESSORS (Getters & Inspectors) ---
  public int getX() { // returns the x-coordinate of this point
    return x;
  }

  public int getY() { // returns the y-coordinate of this point
    return y;
  }

  // returns distance between this Point and (0, 0)
  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  // returns the distance between this Point and another Point
  public double distance(Point other) {
    int dx = x - other.x;
    int dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  // Exercise 1: accessor method that returns the quadrant (1, 2, 3, 4)
  // or 0 if on an axis.
  public int quadrant() {
    // 1. check for the axis case (return 0 if on x OR y axis)
    if (x == 0 || y == 0) {
      return 0;
    }

    // 2. check for Positive X (Quadrants 1 or 4)
    else if (x > 0) {
      if (y > 0) {
        return 1;
      } else {
        return 4;
      }
    }

    // 3. check for Negative X (Quadrants 2 or 3)
    else {
      if (y > 0) {
        return 2;
      } else {
        return 3;
      }
    }
  }

  // Exercise 3: accessor method that returns the Manhattan distance
  // (sum of the absolute values of the differences in the coordinates)
  public int manhattanDistance(Point other) {
    int dx = Math.abs(x - other.x);
    int dy = Math.abs(y - other.y);
    return dx + dy;
  }

  // Exercise 4: accessor method that returns true if the two points form a vertical line.
  public boolean isVertical(Point other) {
    return x == other.x;
  }

  // Exercise 5: accessor method that returns the slope of the line between this point and the other.
  // Throws an IllegalArgumentException for vertical lines.
  public double slope(Point other) {
    // check for vertical line
    if (x == other.x) {
      throw new IllegalArgumentException("Identical x-coordinates");
    }
    return (double) (other.y - y) / (other.x - x);
  }

  // Exercise 6: accessor method that checks if three points are collinear
  // (on the same line).
  public boolean isCollinear(Point p1, Point p2) {

    // The current point is (x, y)
    // The other two points are p1 (p1.x, p1.y) and p2 (p2.x, p2.y)

    // 1. handle vertical lines (Identical x-coordinates for all three points)
    if (x == p1.x && x == p2.x) {
      return true;
    }

    // 2. If any pair is vertical, but the other is not, then we can't calculate the slope
    if (x == p1.x || x == p2.x || p1.x == p2.x) {
      return false;
    }

    // 3. calculate the slopes
    double slopeThisP1 = (double) (p1.y - y) / (p1.x - x);
    double slopeThisP2 = (double) (p2.y - y) / (p2.x - x);

    // 4. round slopes
    double factor = 10000.0;
    slopeThisP1 = Math.round(slopeThisP1 * factor) / factor;
    slopeThisP2 = Math.round(slopeThisP2 * factor) / factor;

    // 5. only need to compare 2 slopes
    return slopeThisP1 == slopeThisP2;
  }

  // --- MUTATORS (Setters and Transformers) ---

  // sets this point's (x, y) location to the given values
  public void setLocation(int newX, int newY) {
    this.x = newX;
    this.y = newY;
  }

  // shifts this point's location by the given amount
  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  }

  // Exercise 2: mutator method that flips the coordinates to (-y, -x)
  public void flip() {
    // calculate the new values using the current state
    int newX = -y;
    int newY = -x;

    // apply the change
    setLocation(newX, newY);
  }

  // returns a String representation of this point
  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
