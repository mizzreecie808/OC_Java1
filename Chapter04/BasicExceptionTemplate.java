public class BasicExceptionTemplate {

    // 1. IllegalArgumentException Example
    // Thrown when an argument is outside the acceptable range.
    public void setSpeed(int newSpeed) {
        if (newSpeed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative. Received: " + newSpeed);
        }
        System.out.println("Speed set to: " + newSpeed);
    }

    // 2. NullPointerException Example
    // Thrown when a method receives a required null argument.
    public void processUserData(String userName) {
        if (userName == null) {
            throw new NullPointerException("Cannot process user data. The 'userName' argument is null.");
        }
        System.out.println("Processing data for user: " + userName);
    }

    // 3. IllegalStateException Example
    // Thrown when an object is in an inappropriate state for a method call.
    public class Printer {
        private boolean isPoweredOn = false;

        public void printDocument() {
            if (!isPoweredOn) {
                throw new IllegalStateException("Printer is off. Must call powerOn() first.");
            }
            System.out.println("Document printed successfully.");
        }

        public void powerOn() {
            this.isPoweredOn = true;
            System.out.println("Printer is now ON.");
        }
    }

    // 4. ArithmeticException Example
    // Thrown for illegal mathematical operations.
    public double calculateRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number.");
        }
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
        return result;
    }

    // 5. ArrayIndexOutOfBoundsException Example
    // Thrown when trying to access an index outside of an array's bounds.
    public void selectItem(String[] menu, int index) {
        if (index < 0 || index >= menu.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid selection. Index " + index +
                                                   " is outside the range [0, " + (menu.length - 1) + "].");
        }
        System.out.println("Selected item: " + menu[index]);
    }

    // --- Main Method to Demonstrate Exceptions ---

    public static void main(String[] args) {
        BasicExceptionTemplate template = new BasicExceptionTemplate();
        String[] menuItems = {"File", "Edit", "View"};

        System.out.println("--- Demonstration of Unchecked Exceptions ---\n");

        // Example 1: IllegalArgumentException
        try {
            template.setSpeed(-10); // This line will throw the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception 1: " + e.getMessage());
        }

        System.out.println("---------------------------------------------");

        // Example 2: NullPointerException
        try {
            template.processUserData(null); // This line will throw the exception
        } catch (NullPointerException e) {
            System.out.println("Caught Exception 2: " + e.getMessage());
        }

        System.out.println("---------------------------------------------");

        // Example 3: IllegalStateException
        Printer myPrinter = template.new Printer();
        try {
            myPrinter.printDocument(); // This line will throw the exception (printer is off)
        } catch (IllegalStateException e) {
            System.out.println("Caught Exception 3: " + e.getMessage());
        }

        System.out.println("---------------------------------------------");

        // Example 4: ArithmeticException
        try {
            template.calculateRoot(-9.0); // This line will throw the exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception 4: " + e.getMessage());
        }

        System.out.println("---------------------------------------------");

        // Example 5: ArrayIndexOutOfBoundsException
        try {
            template.selectItem(menuItems, 5); // This line will throw the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception 5: " + e.getMessage());
        }
    }
}
