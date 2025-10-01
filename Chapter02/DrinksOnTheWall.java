public class DrinksOnTheWall {
  public static void main(String[] args) {
    // outer loop for trips to the store
    for (int store = 1; store <= 2; store++) {
      // inner loop for monsters on the wall
      for (int i = 25; i > 0; i--) {
        String firstLine = i + " cans of Monsters on the wall, " + i +
          " cans of Monsters,";
        String secondLine = "take one down, pass it around, " + (i - 1) +
        " Monsters on the wall.\n";
        System.out.println(firstLine);
        System.out.println(secondLine);
      }
      System.out.println("No more cans of Monsters on the wall, no more cans of Monsters,");
      System.out.println("Let's go to the store and grab a few more,");
      System.out.println("Now we more cans of Monsters on the wall.\n");
    }
  }
}
