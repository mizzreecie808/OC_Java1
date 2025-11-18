public class Rectangle {
  private int x;
  private int y;
  private int width;
  private int height;
  private Point p;

  // --- CONSTRUCTORS ---
  public Rectangle(int x, int y, int width, int height) {
    if (width < 0 || height < 0) {
      throw new IllegalArgumentException("Width and/or Height cannot be negative.");
    }

    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public Rectangle(Point p, int width, int height) {

    if (width < 0 || height < 0) {
      throw new IllegalArgumentException("Width and/or Height cannot be negative.");
    }

    this.x = p.getX();
    this.y = p.getY();
    this.width = width;
    this.height = height;
  }

  // --- ACCESSORS (Getters) ---
  public int getX() { return this.x; }
  public int getY() { return this.y; }
  public int getWidth() { return this.width; }
  public int getHeight() { return this.height; }

  /**
   * --- CONTAINS METHODS ---
   * Returns true if the given (x, y) point is contained within this Rectangle.
   */
  public boolean contains(int x, int y) {
    // The point's X must be between the left edge (this.x) and the right edge (this.x + this.width).
    boolean xFlag = x >= this.x && x <= (this.x + this.width);

    // The point's Y must be between the top edge (this.y) and the bottom edge (this.y + this.height).
    boolean yFlag = y >= this.y && y <= (this.y + this.height);

    // The point is contained only if both conditions are true.
    return xFlag && yFlag;
  }

  public boolean contains(Point p) {
    return this.contains(p.getX(), p.getY());
  }

  public boolean contains(Rectangle rect) {
    // 1. Horizontal check:
    //    Inner left edge >= Outer Left edge && Inner Right edge <= Outer Right edge
    boolean xContained = rect.x >= this.x &&
                          (rect.x + rect.width) <= (this.x + this.width);

    // 2. Vertical check:
    //    Inner Top edge >= Outer Top edge && Inner Bottom edge <= Outer Bottom edge
    boolean yContained = rect.y >= this.y &&
                          (rect.y + rect.height) <= (this.y + this.height);

    return xContained && yContained;
  }

  // --- MUTATORS (Setters and Transformers) ---
  /**
   * Returns a new Rectangle representing the tightest bounding box (Union)
   * that contains both this Rectangle and the given other Rectangle.
   */
  public Rectangle union(Rectangle rect) {

    // 1. New Top-Left Corner (x, y) - the minimum (x, y) of the two rectangles
    int newX = Math.min(this.x, rect.x);
    int newY = Math.min(this.y, rect.y);

    // 2. Find the Farthest Edges (Max X and Max Y)
    // Max X = The x-coordinate of the rightmost edge
    int maxX = Math.max(this.x + this.width, rect.x + rect.width);

    // Max Y = The y-coordinate of the bottommost edge
    int maxY = Math.max(this.y + this.height, rect.y + rect.height);

    // 3. Calculate Dimensions (Distance from Min to Max)
    int newWidth = maxX - newX;
    int newHeight = maxY - newY;

    return new Rectangle(newX, newY, newWidth, newHeight);
  }

  /**
   * Returns a new Rectangle representing the intersection (Overlap)
   * of this Rectangle and the given other Rectangle.
   * If no overlap exists, returns a Rectangle with width and height both equal to 0.
   */
  public Rectangle intersection(Rectangle rect) {
    // 1. New Top-Left Corner (x, y) - farthers to the right and farthest to the
    // bottom of the two starting Points
    int newX = Math.max(this.x, rect.x);
    int newY = Math.max(this.y, rect.y);

    // 2. Find the farthest left shared edge and farthest top shared edge
    // Min X = rightmost edge of overlap, must end at minimum of these two
    int minX = Math.min(this.x + this.width, rect.x + rect.width);

    // Min Y = bottommost edge of overlap, must end at minimum of these two
    int minY = Math.min(this.y + this.height, rect.y + rect.height);

    // 3. Calculate Dimensions (Distance from Min to Max)
    int newWidth = Math.max((minX - newX), 0);
    int newHeight = Math.max((minY - newY), 0);

    return new Rectangle(newX, newY, newWidth, newHeight);
  }

    // --- UTILITIES ---
    @Override
    public String toString() {
      String toPrint = String.format("Rectangle[x=%d, y=%d, width=%d, height=%d]",
        this.x, this.y, this.width, this.height);
      return toPrint;
    }
}
