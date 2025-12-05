/*
Use your pseudocode from the previous exercise to write a Java program
called Window that produces the preceding figure as output.
Use nested for loops to print the repeated parts of the figure.
Once you get it to work, add a class constant so that the size of the
figure can be changed simply by changing the constant’s value.
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
*/
public class C02E19_Window {

  public static int SIZE = 2;

  public static void main(String[] args) {

    pane();
  }

  public static void line() {
    // print starting corner
    System.out.print("+");

    // loop 2x for the 2 divisions
    for (int column = 1; column <= 2; column++) {

      // inner loop: prints (=) SIZE times
      for (int filler = 1; filler <= SIZE; filler++) {
        System.out.print("=");
      }
      // print the divider/end corner
      System.out.print("+");
    }

    // finish the line
    System.out.println();
  }

  public static void pane() {

    line();
    // outer loop: 2x, once for each window pane
    for (int pane = 1; pane <= 2; pane++) {

      // middle loop: controls height of pane, runs SIZE times
      for (int line = 1; line <= SIZE; line++) {

        // print starting pipe
        System.out.print("|");

        // inner loop: repeats the columns content
        for (int column = 1; column <=2; column++) {

          // innermost loop: prints the SIZE empty spaces
          for (int space = 1; space <= SIZE; space++) {
            System.out.print(" ");
          }

          // print pipe divider
          System.out.print("|");
        }

        // finish current line and move to the next
        System.out.println();
      }

      line();
    }
  }
}
