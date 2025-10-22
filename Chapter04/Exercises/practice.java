public class practice {

  public static void main(String[] args) {
    IO.println((char) 45);
  }

  // public static void causeException() {
  //   int x = 1 / 0;
  //   IO.println(x);
  // }

  // pre:  n >= 0
  // post: returns n factorial (n!)
  public static int factorial(int n) {

    // this will halt the execution of the method
    if (n < 0) {
      throw new IllegalArgumentException("negative n: " + n);
    }
    int product = 1;
    for (int i = 2; i <= n; i++) {
      product = product * i;
    }
    return product;
  }

  public static void testFactorial() {
    for (int i = 0; i <= 10; i++) {
      IO.println(i + "! = " + factorial(i));
    }
  }
}
