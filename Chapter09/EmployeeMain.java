public class EmployeeMain {

  public static void main(String[] args) {

    // Chapter 9.1 Inheritance Basics
    employeeMainOne();
    employeeMainTwo();
    employeeMainThree();
    employeeMainFour();
  }

  public static void employeeMainOne() {
    IO.println("---------------------------------------------");
    IO.println("---------    Test Employee Class    ---------");
    IO.println("---------------------------------------------");
    System.out.print("Employee: ");
    Employee edna = new Employee();
    System.out.print(edna.getHours() + ", ");
    System.out.printf("$%.2f, ", edna.getSalary());
    System.out.print(edna.getVacationDays() + ", ");
    System.out.println(edna.getVacationForm());

    System.out.print("Secretary: ");
    Secretary stan = new Secretary();
    System.out.print(stan.getHours() + ", ");
    System.out.printf("$%.2f, ", stan.getSalary());
    System.out.print(stan.getVacationDays() + ", ");
    System.out.println(stan.getVacationForm());
    stan.takeDictation("hello");
    IO.println();
  }

  public static void employeeMainTwo() {
    IO.println("---------------------------------------------");
    IO.println("----    Test Lawyer & Legal Secretary    ----");
    IO.println("---------------------------------------------");
    System.out.print("Lawyer: ");
    Lawyer lucy = new Lawyer();
    // Inherited method (40)
    System.out.print(lucy.getHours() + ", ");
    // Inherited method (50000.00) - BUT LAWYER DOES NOT OVERRIDE SALARY
    System.out.printf("$%.2f, ", lucy.getSalary());
    // OVERRIDDEN method (15)
    System.out.print(lucy.getVacationDays() + ", ");
    // OVERRIDDEN method (pink)
    System.out.println(lucy.getVacationForm());
    // Unique method
    lucy.sue();
    System.out.println();
    // ---------------------------------------------
    // Test Legal Secretary (leo)
    System.out.print("Legal Secretary: ");
    LegalSecretary leo = new LegalSecretary();
    // Inherited method (40)
    System.out.print(leo.getHours() + ", ");
    // OVERRIDDEN method (55000.00)
    System.out.printf("$%.2f, ", leo.getSalary());
    // Inherited method (10)
    System.out.print(leo.getVacationDays() + ", ");
    // Inherited method (yellow)
    System.out.println(leo.getVacationForm());
    // Unique methods
    leo.takeDictation("neato");
    leo.fileLegalBriefs();
    IO.println();
  }

  public static void employeeMainThree() {
    IO.println("---------------------------------------------");
    IO.println("------    Demonstrates Polymorphism    ------");
    IO.println("---------------------------------------------");
    Employee edna = new Employee();
    Lawyer lucy = new Lawyer();
    Secretary stan = new Secretary();
    LegalSecretary leo = new LegalSecretary();

    printInfo(edna);
    printInfo(lucy);
    printInfo(stan);
    printInfo(leo);
    IO.println();
  }

  public static void employeeMainFour() {
    IO.println("---------------------------------------------");
    IO.println("--- Demonstrates Polymorphism in Array    ---");
    IO.println("---------------------------------------------");
    Employee[] employees = {new Employee(), new Lawyer(),
      new Secretary(), new LegalSecretary()};

    for (Employee e: employees) {
      printInfo(e);
    }
  }

  public static void printInfo(Employee e) {
    IO.print(e.getHours() + ", ");
    System.out.printf("$%.2f, ", e.getSalary());
    IO.print(e.getVacationDays() + ", ");
    IO.print(e.getVacationForm());
    IO.println(e);
  }
}
