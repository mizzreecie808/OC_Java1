/*
Write a method called distance that accepts four integer coordinates
x1, y1, x2, y2 as parameters and computes the distance between points
(x1, y1) and (x2, y2)
distance(1, 0, 4, 4) returns 5.0
distance(10, 2, 3, 15) returns 14.7648230602334
*/
public class C03E11_distance {
  public static void main(String[] args) {
    distance(1, 0, 4, 4);
    distance(10, 2, 3, 15);
  }

  public static double distance(int x1, int y1, int x2, int y2) {
    double under = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    System.out.println(Math.sqrt(under));
    return Math.sqrt(under);
  }
}
