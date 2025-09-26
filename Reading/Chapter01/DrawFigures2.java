public class DrawFigures2 {
  // the method call is in the main
  public static void main(String[] args) {
    drawDiamond();
    drawX();
    drawRocket();
  }

  public static void drawDiamond() {
    IO.println("   /\\");
    IO.println("  /  \\");
    IO.println(" /    \\");
    IO.println(" \\    /");
    IO.println("  \\  /");
    IO.println("   \\/");
    IO.println();
  }

  public static void drawX() {
    IO.println(" \\    /");
    IO.println("  \\  /");
    IO.println("   \\/");
    IO.println("   /\\");
    IO.println("  /  \\");
    IO.println(" /    \\");
    IO.println();
  }

  public static void drawRocket() {
    IO.println("   /\\");
    IO.println("  /  \\");
    IO.println(" /    \\");
    IO.println("+------+");
    IO.println("|      |");
    IO.println("|      |");
    IO.println("+------+");
    IO.println("|United|");
    IO.println("|States|");
    IO.println("+------+");
    IO.println("|      |");
    IO.println("|      |");
    IO.println("+------+");
    IO.println("   /\\");
    IO.println("  /  \\");
    IO.println(" /    \\");
  }
}
