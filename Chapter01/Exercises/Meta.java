/*
Chapter 01 - Exercise 6
Write a complete Java program called Meta whose output is the text that
would be the source code of a Java program that prints “Hello, world!”
as its output.
*/

public class Meta {
  public static void main(String[] args) {
    System.out.println("public class Meta {");
    System.out.println("  public static void main(String[] args) {");
    System.out.println("    System.out.println(\"Hello, world!\");");
    System.out.println("  }");
    System.out.println("}");
  }
}
