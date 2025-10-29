/*
Write a method called hopscotch that accepts an integer number of “hops” as its parameter
and prints a pattern of numbers that resembles a hopscotch board. A “hop” is a three-number
sequence where the output shows two numbers on a line, followed by one number on its own
line.
0 hops is a board up to 1;
one hop is a board up to 4;
two hops is a board up to 7; and so on.
hopscotch(3); should print the following output:
   1     (0)
2     3
   4     (1)
5     6
   7     (2)
8     9
  10     (3)
*/

public class C05E10_hopscotch {
  public static void main(String[] args) {

    hopscotch(3);
  }

  public static void hopscotch(int hops) {

    int currentNum = 1;

    // if hops(3) this loop will run 0, 1, 2, 3
    for (int i = 0; i < hops; i++) {

      // line 1 prints the centered number
      IO.println("   " + currentNum);

      // line 2 prints the next numbers with 5 spaces in between
      IO.println((currentNum + 1) + "     " + (currentNum + 2));
      currentNum += 3;
    }
    IO.println("   " + currentNum);
  }
}
