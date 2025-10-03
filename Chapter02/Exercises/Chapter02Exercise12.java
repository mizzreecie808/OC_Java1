/*
Write nested for loops that produce the following:
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
*/
public class Chapter02Exercise12 {

  public static final int SCALE = 3;
  public static final int REPEAT = 3;
  public static final int COUNT = 8;

  public static void main(String[] args) {

    repeat();

  }

  // method for numbers
  public static void numbers() {
    for (int i = 0; i <= COUNT; i ++) {
      for (int j = 1; j <= REPEAT; j++) {
          System.out.print(i);
      }
    }
  }

  public static void repeat() {
    for (int i = 1; i <= SCALE; i++) {
      numbers();
      System.out.println();
    }
  }
}
