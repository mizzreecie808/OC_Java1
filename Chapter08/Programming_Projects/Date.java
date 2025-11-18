public class Date {

  // Fields (state)
  private int year;
  private int month;
  private int day;

  // --- CONSTRUCTORS ---
  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public Date(Date other) {
    // initializes the new object's fields using the other objects fields
    this.year = other.year;
    this.month = other.month;
    this.day = other.day;
  }

  // --- ACCESSORS (Getters & Inspectors) ---
  public int getYear() { return this.year; }
  public int getMonth() { return this.month; }
  public int getDay() { return this.day; }

  public int daysTo(Date other) {
    // 1. Create a temporary copy of this Date
    Date current = new Date(this);

    // 2. initialize a daysPassed counter
    int daysPassed = 0;

    // 3. Loop through both dates until they are equal to determine days between
    while (!current.equals(other)) {
      current.addDays(1);
      daysPassed++;
    }
    return daysPassed;
  }

  // helper method to get total elapsed days


  // --- MUTATORS (Setters and Transformers) ---
  public void addDays(int days) {
    // Step 1: Add the days directly to the day field
    this.day += days;

    // Step 2: Continuously check and roll over the date until the day value is valid.
    // Assumes that daysInMonth method uses this.month and this.year
    while (this.day > daysInMonth(this.month, this.year)) {
      // 1. Subtract the total days of the current month
      this.day -= daysInMonth(this.month, this.year);

      // 2. Advance the month.
      this.month++;

      // 3. Handle the year rollover if the month goes past 12
      if (this.month > 12) {
        this.month = 1; // Reset to January
        this.year++;    // Increment the year
      }
    }
  }

  public void addWeeks(int weeks) {
    int daysToAdd = weeks * 7;
    addDays(daysToAdd);
  }

  // helper method to check days in month
  public int daysInMonth(int month, int year) {
    if (month == 2) {
      // Check for leap year:
      if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
        return 29;
      } else {
        return 28;
      }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;  // April, June, September, November
    } else {
      return 31;
    }
  }
}
