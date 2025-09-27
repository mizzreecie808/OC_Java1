// This program contains a function that calls itself
public class Oops {
  public static void main(String[] args) {
    oops();
  }

  public static void oops() {
    System.out.println("Make it stop!");
    // If you uncomment the following, you will get a runtime error
    // oops();
  }
}
