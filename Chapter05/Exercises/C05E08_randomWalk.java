/*
Write a method called randomWalk that performs steps of a random one-dimensional walk.
The random walk should begin at position 0. On each step, you should either increase or
decrease the position by 1 (each with equal probability). Your code should continue making
steps until a position of 3 or -3 is reached, and then report the maximum position that
was reached during the walk. The output should look like the following:
position = 1
position = 0
position = –1
position = –2
position = –1
position = –2
position = –3
max position = 1
*/

import java.util.*;

public class C05E08_randomWalk {
  public static void main(String[] args) {

    randomWalk();

  }

  public static void randomWalk() {
    // Random object initialization
    Random r = new Random();

    int position = 0;

    // records single farther position
    int maxPosition = 0;

    // use while loop, tired do/while and it wouldn't execute
    while (maxPosition > -3 && maxPosition < 3) {
      // use true false for increase/decrese step
      boolean moveRight = r.nextBoolean();
      if (moveRight) {
        position++;
      } else {
        position--;
      }
      System.out.printf("position = %2d%n", position);

      // update the max position, must use absolute distance
      int currDistance = Math.abs(position);
      if (currDistance > maxPosition) {
        maxPosition = currDistance;
      }
    }
    IO.println("max position = " + maxPosition);

  }
}
