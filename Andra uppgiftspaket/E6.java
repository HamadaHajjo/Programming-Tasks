/*

The program prints the first (positive) odd numbers.
The bound saying how many odd numbers are printed is given
as a command line argument.
The bound can be any non-negative number.

*/

public class E6{

  public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      int i;
      System.out.println("The first " + n + " odd numbers are:");
  for(i=1; i<=2*n; i=i+2)
  {
    if(i % 2 == 0)
  continue;
  else
    System.out.println(i);
  }
  }

}
