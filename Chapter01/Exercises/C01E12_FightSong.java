/*
Chapter 01 - Exercise 12
Write a Java program called FightSong that produces the following output.
Use at least two static methods to show structure and eliminate redundancy
in your solution.
Go, team, go!
You can do it.

Go, team, go!
You can do it.
You're the best,
In the West.
Go, team, go!
You can do it.

Go, team, go!
You can do it.
You're the best,
in the West.
Go, team, go!
You can do it.

Go, team, go!
You can do it.
*/
public class C01E12_FightSong {
  public static void main(String[] args) {
    goTeam();
    System.out.println();
    chorous();
    System.out.println();
    chorous();
    System.out.println();
    goTeam();
  }

  public static void goTeam() {
    System.out.println("Go, team, go!");
    System.out.println("You can do it.");
  }

  public static void bestWest() {
    System.out.println("You're the best,");
    System.out.println("In the West.");
  }

  public static void chorous() {
    goTeam();
    bestWest();
    goTeam();
  }
}
