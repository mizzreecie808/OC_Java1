/*
 * A dedicated test class for the TimeSpan class.
 * Confirms constructor, accessor, and mutator methods work correctly.
 */
public class TimeSpanMain {
  public static void main(String[] args) {

    System.out.println("--- 1. Testing Constructor and toString() (Auto-Normalization) ---");

    // T1: 1h 30m
    TimeSpan t1 = new TimeSpan(1, 30);
    System.out.println("T1 (1h 30m): " + t1 + " (Expected: 1h 30m)");

    // T2: 1h 35m (from 95m)
    TimeSpan t2 = new TimeSpan(0, 95);
    System.out.println("T2 (0h 95m): " + t2 + " (Expected: 1h 35m)");

    // T3: 5h 37m (from 3h + 157m)
    TimeSpan t3 = new TimeSpan(3, 157);
    System.out.println("T3 (3h 157m): " + t3 + " (Expected: 5h 37m)");

    // -------------------------------------------------------------
    System.out.println("\n--- 2. Testing Accessor Methods (getHours, getMinutes) ---");

    // Use T3 (5h 37m)
    System.out.println("T3 Hours: " + t3.getHours() + " (Expected: 5)");
    System.out.println("T3 Minutes: " + t3.getMinutes() + " (Expected: 37)");

    // -------------------------------------------------------------
    System.out.println("\n--- 3. Testing add(int, int) Mutator (T1: 1h 30m) ---");

    // Operation: 1h 30m + 2h 40m = 4h 10m
    String originalT1 = t1.toString();
    t1.add(2, 40);
    System.out.println("T1: " + originalT1 + " + 2h 40m = " + t1 + " (Expected: 4h 10m)");

    // -------------------------------------------------------------
    System.out.println("\n--- 4. Testing add(TimeSpan) Mutator (T2: 1h 35m, T3: 5h 37m) ---");

    // Operation: 1h 35m + 5h 37m = 7h 12m
    // FIX: Declared originalT2 as String
    String originalT2 = t2.toString();
    System.out.println("Adding T3: " + t3 + " to T2: " + originalT2);
    t2.add(t3);
    System.out.println("New T2: " + t2 + " (Expected: 7h 12m)");

    // -------------------------------------------------------------
    System.out.println("\n--- 5. Testing subtract Mutator Methods ---");

    // Test 5a: subtract(int, int) (T1: 4h 10m - 1h 20m = 2h 50m)
    String t1BeforeSub1 = t1.toString();
    t1.subtract(1, 20);
    System.out.println("T1: " + t1BeforeSub1 + " - 1h 20m = " + t1 + " (Expected: 2h 50m)");

    // Test 5b: subtract(TimeSpan) (T2: 7h 12m - T1: 2h 50m = 4h 22m)
    String t2BeforeSub2 = t2.toString();
    System.out.println("Subtracting T1: " + t1 + " from T2: " + t2BeforeSub2);
    t2.subtract(t1);
    System.out.println("New T2: " + t2 + " (Expected: 4h 22m)");

    // -------------------------------------------------------------
    System.out.println("\n--- 6. Testing scale(int factor) Mutator ---");

    // Use T3 (5h 37m = 337m)

    // Test 6a: Scale by 2 (337m * 2 = 674m = 11h 14m)
    String t3BeforeScale = t3.toString();
    t3.scale(2);
    System.out.println("T3: " + t3BeforeScale + " * 2 = " + t3 + " (Expected: 11h 14m)");

    // Test 6b: Scale by 0 (Should result in 0h 0m)
    String t1BeforeScale = t1.toString(); // T1 is 2h 50m
    t1.scale(0);
    System.out.println("T1: " + t1BeforeScale + " * 0 = " + t1 + " (Expected: 0h 0m)");
  }
}
