/**
 * Client code to test the Date class functionality (addDays, addWeeks, daysTo).
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println("--- Date Class Tester ---");

        // --- Test 1: Simple Month Rollover ---
        Date d1 = new Date(1, 28, 2024); // January 28, 2024
        System.out.println("\n[Test 1: Simple Rollover]");
        System.out.println("Start Date: " + d1);

        d1.addDays(5); // Should roll into February
        System.out.println("After addDays(5): " + d1 + " (Expected: 02/02/2024)");

        // --- Test 2: Year Rollover (Leap Year) ---
        Date d2 = new Date(12, 25, 2024); // December 25, 2024 (2024 is a leap year)
        System.out.println("\n[Test 2: Year Rollover]");
        System.out.println("Start Date: " + d2);

        d2.addDays(7); // Should roll into January 1, 2025
        System.out.println("After addDays(7): " + d2 + " (Expected: 01/01/2025)");

        // --- Test 3: addWeeks Test ---
        Date d3 = new Date(3, 15, 2025); // March 15, 2025
        System.out.println("\n[Test 3: addWeeks]");
        System.out.println("Start Date: " + d3);

        d3.addWeeks(3); // Adds 21 days
        System.out.println("After addWeeks(3): " + d3 + " (Expected: 04/05/2025)");

        // --- Test 4: daysTo (Accessor) Test Cases ---
        System.out.println("\n[Test 4: daysTo Calculation]");

        // Case A: Simple forward difference (d4 is 7 days before d5)
        Date d4 = new Date(5, 1, 2025);
        Date d5 = new Date(5, 8, 2025);
        int diffA = d4.daysTo(d5);
        System.out.println("Days from " + d4 + " to " + d5 + " is: " + diffA + " (Expected: 7)");

        // Case B: Backward difference (d5 is 7 days after d4, so -7)
        int diffB = d5.daysTo(d4);
        System.out.println("Days from " + d5 + " to " + d4 + " is: " + diffB + " (Expected: -7)");

        // Case C: Cross-year difference (2025 to 2026)
        Date d6 = new Date(12, 31, 2025);
        Date d7 = new Date(1, 2, 2026);
        int diffC = d6.daysTo(d7);
        System.out.println("Days from " + d6 + " to " + d7 + " is: " + diffC + " (Expected: 2)");
    }
}
