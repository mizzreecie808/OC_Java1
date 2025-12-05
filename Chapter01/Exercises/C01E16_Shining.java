/*
Write a program called Shining that prints the following line of output 1000 times:
All work and no play makes Jack a dull boy.
You should not write a program that uses 1000 lines of source code; use methods to
shorten the program. What is the shortest program you can write that will produce the
1000 lines of output, using only the material from this chapter?
*/

public class C01E16_Shining {
  public static void main(String[] args) {
    allWork();
  }

  public static void allWork() {
    String message = "All work and no play makes Jack a dull boy.\n";
    System.out.println(message.repeat(10));
  }
}
