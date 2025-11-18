/*
TimeSpan object represents an interval of elapsed hours and minutes
*/

public class TimeSpan {
  private int totalMinutes;

  // Construct a time span with the given interval and set at 0 hour 0 min
  public TimeSpan(int hours, int minutes) {
    this.totalMinutes = 0;

    // call the add method to add any user input hours and minutes
    add(hours, minutes);
  }

  // -- ACCESSORS --
  // access hours of TimeSpan object
  public int getHours() {
    return totalMinutes / 60;
  }

  // access minutes of TimeSpan object
  public int getMinutes() {
    return totalMinutes % 60;
  }

  // -- MUTATORS --
  // add (hours, minutes) to this time span
  public void add(int hours, int minutes) {
    // validate that (hours, minutes) > 0
    if (hours < 0 || minutes < 0) {
      throw new IllegalArgumentException("Hours and minutes must be positive.");
    }

    totalMinutes += 60 * hours + minutes;
  }

  // 8.7 mutator method to add to the time span object
  public void add(TimeSpan span) {
    add(span.getHours(), span.getMinutes());
  }

  // subtract (hours, minutes) from this time span
  public void subtract(int hours, int minutes) {
    // validate that (hours, minutes) > 0
    if (hours < 0 || minutes < 0) {
      throw new IllegalArgumentException("Hours and minutes must be positive.");
    }

    int minutesToSubtract = 60 * hours + minutes;

    // validate that minutesToSubtract will not result in a negative time frame
    if (this.totalMinutes < minutesToSubtract) {
      throw new IllegalArgumentException("Negative time span due to subtraction.");
    }

    this.totalMinutes -= minutesToSubtract;
  }

  // Exercise 8.8 mutator method subtract the given amount of time from this time span
  public void subtract(TimeSpan span) {
    // validate that totalMinutes will not become negative
    if (this.totalMinutes < span.totalMinutes) {
      throw new IllegalArgumentException("Negative time span due to subtraction.");
    }

    this.totalMinutes -= span.totalMinutes;
  }

  // Exercise 8.9 mutator method to scale time span by a given factor
  public void scale(int factor) {
    // validate that factor is non-negative
    if (factor < 0) {
      throw new IllegalArgumentException("Factor cannot be negative.");
    }
    this.totalMinutes *= factor;
  }

  // create class toString method
  public String toString() {
    return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m";
  }
}
