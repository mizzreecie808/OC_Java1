public class Janitor extends Employee {
  // overrides getSalary from Employee class
  public double getSalary() {
    // return 30000.0;
    // $10k less than general employees
    return super.getSalary() - 10000;
  }

  // overrides getHours from Employee class
  public int getHours() {
    // return 80
    // 2x as many hours as general employees
    return super.getHours() + 40;
  }

  // overrides getVacationDays from Employee class
  public int getVacationDays() {
    // return 5;
    // 1/2 as many as general employees
    return super.getVacationDays() / 2;
  }

  public void clean() {
    System.out.println("Workin' for the man.");
  }
}
