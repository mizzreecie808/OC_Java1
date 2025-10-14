/*
Write a program that shows the total number of presents that the person
in the song “The Twelve Days of Christmas” received on each day, as indicated
in Table 3.5.
*/

public class C03PP03_totalPresents {
  public static void main(String[] args) {

    presentTable();

  }

  // method to print the header with proper spacing
  public static void printHeader() {
    IO.print(padded("Day", 5));
    IO.print(padded("Presents Received", 17));
    IO.println(padded("Total Presents", 14) + "|");
  }

  public static void presentTable() {
    printHeader();
    int presents = 0;
    for (int day = 1; day <= 12; day++) {
      presents += day;

      IO.print(padded(day, 5));
      IO.print(padded(day, 18));
      IO.println(padded(presents, 15) + "|");
    }
  }

  // overload method from chapter to pad the table lines
  public static String padded(int num, int width) {
    String s = "" + num;
    for (int i = s.length(); i < width - 1; i++) {
        s = " " + s;
    }
    return "| " + s + " ";
  }

  // overload method from chapter to pad the table header
  public static String padded(String word, int width) {
    for (int i = word.length(); i < width - 1; i++) {
        word = " " + word;
    }
    return "| " + word + " ";
  }
}
