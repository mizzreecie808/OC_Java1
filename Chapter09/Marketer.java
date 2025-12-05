public class Marketer extends Employee {
  // overrides getSalary from Employee class
  public double getSalary() {
    // return 50000.0;
    // $10k more than general employees
    return super.getSalary() + 10000;
  }

  public void advertise() {
    System.out.println("Act now, while supplies last!");
  }
}
