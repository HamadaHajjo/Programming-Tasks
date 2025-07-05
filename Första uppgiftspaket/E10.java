/*

Add code to print
five uniform random values between 0 and 1,
their average value and
their minimum and maximum value.

Use Math.random(), Math.min(), and Math.max().

*/
public class E10{

  public static void main(String[] args) {

        Double x = (Double)(Math.random());
        Double y = (Double)(Math.random());
        Double z = (Double)(Math.random());
        Double g = (Double)(Math.random());
        Double f = (Double)(Math.random());


        Double avrege = ((x+y+z+g+f) / 5);
        double small = Math.min(x, Math.min(y, Math.min(z, Math.min(g,f))));
        Double big = Math.max(x, Math.max(y, Math.max(z, Math.max(g,f))));
        System.out.println("The five random numbers between 0 and 1 are:  " + x + " " + y + " " +z +  " " + g + " " + f);
        System.out.println("The avrege value between those five numbers is :" + avrege);
        System.out.println("The smallest number between those five values is: " + small);
        System.out.println("The maximum value of those 5 numbers is: " + big);

  }

}
