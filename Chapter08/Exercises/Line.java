public class Line {

    // Fields (state)
    private Point p1; // starting point
    private Point p2; // ending point

    // CONSTRUCTORS:
    public Line(Point p1, Point p2) {
      this.p1 = p1;
      this.p2 = p2;

    }

    // construct a new Line that constains the given two Points
    public Line(int x1, int y1, int x2, int y2) {
      // 1. Create the first Point object
      Point p1 = new Point(x1, y1);

      // 2. Create the second Point object
      Point p2 = new Point(x2, y2);

      // 3. Chain to the primary constrcutor using 'this'
      this(p1, p2);
    }

    // --- ACCESSORS (Getters & Inspectors) ---
    public Point getP1() {
      return new Point(this.p1);

    }

    public Point getP2() {
      return new Point(this.p2);
    }

    // return [(22, 3), (4, 7)]
    @Override
    public String toString() {
      return "[" + this.p1.toString() + ", " + this.p2.toString() + "]";
    }

    // accessor: returns the slope of this Line
    public double getSlope() {
      // check for vertical line
      if (this.p1.getX() == this.p2.getX()) {
        throw new IllegalArgumentException("Slope is undefined for vertical lines.");
      }

      // Formula: (y2 - y1) / (x2 - x1)
      // Cast the numerator to double to force floating-point division.
      return (double) (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
    }

    // accessor: returns true if given Point is collinear
    public boolean isCollinear(Point p) {

      // 1. handle vertical lines (Identical x-coordinates for all three points)
      if (this.p1.getX() == this.p2.getX() && this.p1.getX() == p.getX()) {
        return true;
      }

      // 2. If any pair is vertical, but the other is not, then we can't calculate the slope
      if (p.getX() == this.p1.getX() || p.getX() == this.p2.getX() || this.p1.getX() == this.p2.getX()) {
        return false;
      }

      // 3. calculate the slopes
      double slope1 = getComparisonSlope(this.p1, this.p2);
      double slope2 = getComparisonSlope(this.p1, p);

      // 4. round slopes
      double factor = 10000.0;
      slope1 = Math.round(slope1 * factor) / factor;
      slope2 = Math.round(slope2 * factor) / factor;

      return slope1 == slope2;
    }

    /**
     * PRIVATE HELPER: Calculates the slope between two points for comparison purposes.
     * Returns a very large number for vertical lines instead of throwing an exception,
     * which allows safe comparison and rounding in isCollinear().
     */
    private double getComparisonSlope(Point pA, Point pB) {
      if (pA.getX() == pB.getX()) {
        // Use a large constant for vertical lines
        return 999999999.0;
      }
      return (double) (pb.getY() - pA.getY()) / (pB.getX() - pA.getX());
    }
    // --- MUTATORS (Setters and Transformers) ---

}
