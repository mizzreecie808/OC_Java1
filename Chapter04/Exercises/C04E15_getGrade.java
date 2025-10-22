/*
Write a method called getGrade that accepts an integer representing a student’s grade
in a course and returns that student’s numerical course grade. The grade can be between
0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100 and that
grades are based on the following scale:
For an added challenge, make your method throw an IllegalArgumentException if the user
passes a grade lower than 0 or higher than 100.
*/
public class C04E15_getGrade {
  public static void main(String[] args) {

    IO.println(pow2(-4.0, 3));
    IO.println(pow2(4.0, -2));

  }

  public static double getGrade(int score) {
    if (score > 100 || score < 0) {
      throw new IllegalArgumentException("Scores must be between 0-100.");
    }
  }
}
