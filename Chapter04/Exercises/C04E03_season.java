/*
Write a method called season that takes as parameters two integers representing
a month and day and returns a String indicating the season for that month and
day. Assume that the month is specified as an integer between 1 and 12
(1 for January, 2 for February, and so on) and that the day of the month
is a number between 1 and 31. If the date falls between 12/16 and 3/15, the
method should return "winter". If the date falls between 3/16 and 6/15, the
method should return "spring". If the date falls between 6/16 and 9/15, the
method should return "summer". And if the date falls between 9/16 and 12/15,
the method should return "fall".
*/
public class C04E03_season {
  public static void main(String[] args) {

    IO.println(season(12, 16));

  }

  public static String season(int month, int day) {
    // 12-16 to 3-15 winter
    if (month <= 2 || (month == 3 && day <= 15) || (month == 12 && day >= 16)) {
      return "winter";
      // 9-16 to 12-15 fall
    } else if (month > 9 || (month == 9 && day >=16)) {
      return "fall";
      // 6-16 to 9-15 summer
    } else if (month > 6 || (month == 6 && day >= 16)) {
      return "summer";
      // 3-16 to 6-15 spring
    } else {
      return "spring";
    }
  }
}
