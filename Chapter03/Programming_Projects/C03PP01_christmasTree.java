/*
Write a program that produces images of Christmas trees as output.
It should have a method with two parameters: one for the number of segments
in the tree and one for the height of each segment.
Tree on the left has three segments of height 4
Tree on the right has two segments of height 5
*******

*/
public class C03PP01_christmasTree {

  public static final int SEGMENTS = 3;
  public static final int HEIGHT = 4;

  public static void main(String[] args) {
    // christmasTree();
    // printTrunk();
    IO.println(Math.round(100 * Math.pow(3.0, Math.sqrt(7.5)/5.0)));
  }

  public static void christmasTree() {
    // outer loop, 3x one for each segment
    for (int segment = 1; segment <= SEGMENTS; segment++) {

      // inner loop, 4x one for each line of height
      for (int line = 1; line <= HEIGHT; line++) {

        int spaceFactor = 7 - line - segment;
        for (int space = 1; space <= spaceFactor; space++) {
           System.out.print(" ");
        }

        int starFactor = (2 * line) + (2 * segment) - 3;
        for (int star = 1; star <= starFactor; star++) {
          System.out.print("*");
        }

        System.out.println();
      }
    }
  }

  // Prints the trunk (a simple 1-star element centered below the tree).
  public static void printTrunk() {
    // Space Factor (Formula: H + S - 2) to center the 1-star trunk
    int trunkSpaces = (HEIGHT + SEGMENTS) - 2;

    // Print the trunk lines (e.g., 2 lines)
    for (int i = 1; i <= 2; i++) {
        for (int space = 1; space <= trunkSpaces; space++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    System.out.println("  *******");
  } // <--- Closes printTrunk method
}
