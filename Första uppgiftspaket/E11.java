/*

Add code to
  read three int values from the command line and
  print them in ascending order.

Use Math.min() and Math.max().

*/

public class E11{

  public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int small = Math.min(a, Math.min(b,c));
        int large = Math.max(a, Math.max(b,c));
        int mid = (a+b+c) - (small + large);
        System.out.println("The numbers that you typed are: " + a +" "+b+" "+ c + ".");
        System.out.println("The numbers in ascending order are: " + small+" "+ mid +" "+large);

  }

}
