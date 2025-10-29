/*
Write a method called threeHeads that repeatedly flips a coin until the results of the
coin toss are three heads in a row. You should use a Random object to make it equally
likely that a head or a tail will appear. Each time the coin is flipped, display H for
heads or T for tails. When three heads in a row are flipped, the method should print a
congratulatory message. Here is a possible output of a call to the method:
T T H T T T H T H T H H H
Three heads in a row!
*/
import java.util.Random;

public class C05E11_threeHeads {
  public static void main(String[] args) {

    threeHeads();
  }

  public static void threeHeads(int seed) {

    Random flip = new Random(seed);

    // count 3 heads
    int triple = 0;

    // prime the display
    String display;
    if (flip.nextBoolean()) {
      display = "H";
      triple++;
    } else {
      display = "T";
    }

    int count = 1;

    while (triple != 3) {
      if (flip.nextBoolean()) {
        display = display + " H";
        triple++;
      } else {
        display = display + " T";
        triple = 0;
      }
      count++;
    }
    IO.println(display);
    IO.println("Three heads in a row!");
    IO.println("It took a total of " + count + " flips!");
  }
}
