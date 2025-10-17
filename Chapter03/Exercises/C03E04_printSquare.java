/*
Write a method called printSquare that accepts a minimum and maximum
integer and prints a square of lines of increasing numbers. The first
line should start with the minimum, and each line that follows should
start with the next-higher number. The sequence of numbers on a line wraps
back to the minimum after it hits the maximum. For example, the call

printSquare(3, 7);
34567
45673
56734
67345
73456
*/
public class C03E04_printSquare {
  public static void main(String[] args) {
    printSquare(3, 7);
  }

  public static void printSquare(int min, int max) {

    int rangeSize = max - min + 1;
    // outer loop controls starting number of each line
    for (int start = min; start <= max; start++) {

      // inner loop controls offset from starting number
      for (int offset = 0; offset < rangeSize; offset++) {
        int rawSum = start + offset;
        int printNum = (rawSum - min) % rangeSize + min;
        System.out.print(printNum);
      }
      System.out.println();
    }
  }
}

/*
final wrapped number formula:
(raw sum - minimum) (mod Range Size) + minimum
raw sum: starting number for the start plus the columns offset
minimum: the min value passed
range size: calculated = max - min + 1
*/
