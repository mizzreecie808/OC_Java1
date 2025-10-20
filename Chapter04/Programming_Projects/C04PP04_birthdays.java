/*
Write a program that prompts for a number and displays it in Roman numerals.
*/

import java.util.Scanner;

public class C04PP04_birthdays {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    prompt(console);
  }

  public static void prompt(Scanner console) {
    int totalDays1 = promptForDate(console, "Person #1");
    int totalDays2 = promptForDate(console, "Person #2");
    int totalDays3 = promptForDate(console, "Current");

    final int DAYS_IN_YEAR = 365;

    // --- Logic for Person #1 ---
    int daysUntil1;
    if (totalDays1 >= totalDays3) {
      daysUntil1 = totalDays1 - totalDays3;
    } else {
      daysUntil1 = (DAYS_IN_YEAR - totalDays3) + totalDays1;
    }

    // --- Logic for Person #2 ---
    int daysUntil2;
    if (totalDays2 >= totalDays3) {
      daysUntil2 = totalDays2 - totalDays3;
    } else {
      daysUntil2 = (DAYS_IN_YEAR - totalDays3) + totalDays2;
    }
    IO.println("Person #1 " + daysUntil1 + " days till birthday.");
    IO.println("Person #2 " + daysUntil2 + " days till birthday.");

  }

  public static int promptForDate(Scanner console, String label) {

    String monthLabel = label.contains("Current") ? "month" : "birth month";
    String dayLabel = label.contains("Current") ? "day" : "birth day";

    // Prompt for month
    System.out.printf("%-22s", label + " " + monthLabel + ": ");
    int month = console.nextInt();

    // Prompt for day
    System.out.printf("%-22s", label + " " + dayLabel + ": ");
    int day = console.nextInt();

    return countDays(month, day);
  }

  public static int countDays(int month, int day) {
    int countDays = day;
    for (int i = 1; i < month; i++) {
      if (i == 2) {
        countDays += 28;
      } else if (i == 4 || i == 6 || i == 9 || i == 11) {
        countDays += 30;
      } else {
        countDays += 31;
      }
    }
    IO.println(countDays);
    return countDays;
  }
}
