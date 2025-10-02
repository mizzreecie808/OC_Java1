public class Oops2 {
  public static void main(String[] args) {
    int x;
    // 1) x is not assigned a variable
    // 2) x was not assigned, so that will be an error
    // 3) there is no '+' to concatenate string with int
    System.out.println("x is" x);

    // 4) re-using variable not allowed
    int x = 15.2; // set x to 15.2
    // 5) 'x' is within the string so it will just be the char 'x'
    System.out.println("x is now + x");

    // 6) can't delcare an int within an assignment, must be cast
    int y;  // set y to 1 more than x
    y = int x + 1;
    System.out.println("x and y are" + x + and + y);
  }
}
