public class DrawFigures3 {
  // the method call is in the main
  public static void main(String[] args) {
    drawDiamond();
    drawX();
    drawRocket();
  }

  public static void drawDiamond() {
    drawCone();
    drawV();
    IO.println();
  }

  public static void drawX() {
    drawV();
    drawCone();
    IO.println();
  }

  public static void drawRocket() {
    drawCone();
    drawBox();
    IO.println("|United|");
    IO.println("|States|");
    drawBox();
    drawCone();
    IO.println();
  }

  public static void drawCone() {
    IO.println("   /\\");
    IO.println("  /  \\");
    IO.println(" /    \\");
  }

  public static void drawV() {
    IO.println(" \\    /");
    IO.println("  \\  /");
    IO.println("   \\/");
  }

  public static void drawBox() {
    IO.println("+------+");
    IO.println("|      |");
    IO.println("|      |");
    IO.println("+------+");
  }
}
