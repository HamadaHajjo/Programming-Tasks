/*

Add the code needed to take
three real numbers as command line arguments
and output
the distance from the point with these numbers as coordinates to the origin.

Note: to convert a String to a double you should use
  Double.parseDouble
(similar to Integer.parseInt that converts String to int).

*/

public class E8{

  public static void main(String[] args) {

Double x = Double.parseDouble(args[0]);
Double y = Double.parseDouble(args[1]);
Double z = Double.parseDouble(args[2]);
double distance = Math.sqrt((x*x) + (y*y) + (z*z));
String e = "The distance from the point with these numbers as coordinates to the origin : ";
System.out.println(e + distance);

  }

}
