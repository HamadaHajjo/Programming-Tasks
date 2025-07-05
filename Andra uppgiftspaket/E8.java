/*

The program solves the quadratic equation
    x*x + b*x + c = 0

Your task is to improve it to that if there is
no solution (in the real numbers)
the program does not try to calculate the roots.

There are no solutions when the discriminant is negative.

If there are no solutions the program should print the message
    There are no real solutions.
and terminate.

You have to decide where to place your code.

*/
public class E8{
  public static void main(String[] args) {

     double b = Double.parseDouble(args[0]);
     double c = Double.parseDouble(args[1]);
     double disc = b * b - 4 * c;
     if (disc<0){
       System.out.println("There are not real numbers solution found for your numbers");
       System.exit(0);
       }
     double sol1 = (-b + Math.sqrt(disc)) / 2;
     double sol2 = (-b - Math.sqrt(disc)) / 2;
     System.out.println(sol1);
     System.out.println(sol2);

   }
}
