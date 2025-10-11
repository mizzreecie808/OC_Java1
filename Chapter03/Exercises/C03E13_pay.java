/*
Write a method called pay that accepts two parameters:
a real number for a TA’s salary,
and an integer for the number of hours the TA worked this week.
The method should return how much money to pay the TA.
pay(5.50, 6) should return 33.0.
The TA should receive “overtime” pay of 1-1/2 x normal salary above 8 hours
pay(4.00, 11) should return 50.0
*/


public class C03E13_pay {
  public static void main(String[] args) {
    double salary1 = pay(5.50, 6);
    double salary2 = pay(4.00, 11);
    IO.println(salary1);
    IO.println(salary2);

  }

  public static double pay(double salary, int hours) {
    int overtimeHours = Math.max(0, hours - 8);
    int regular = hours - overtimeHours;
    return (regular * salary) + (overtimeHours * salary * 1.5);
  }
}
