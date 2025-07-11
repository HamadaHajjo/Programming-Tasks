/*
The classes StdDraw and Luminance need to be in the
same directory as this program.
The two classes were included in the zip file for the exercises.

The program reads 6 integer numbers,
all in the interval 0 .. 255, from the command line:

r1 g1 b1 r2 g2 b2

and uses the first three as the red, green and blue components of
a color and the last three as the red, green and blue components of
another color.

The program uses StdDraw to show five pairs of squares.
The image e1.png included in the zip file illustrates
what the program should do.

The image was generated using

java E1 255 200 100  200 100 255

Your task is to complete fragments of the code.
Your tasks are marked with
   Your code here
*/
import java.awt.Color;
public class E1{
  /*
  toRed(c) returns a color with
     the same red component as c
     but 0 green and 0 blue.
  */
  public static Color toRed(Color c){
  Color C = new Color (c.getRed(),0,0);
  return C;
  }

  /*
  toGreen(c) returns a color with
     the same green component as c
     but 0 red and 0 blue.
  */
  public static Color toGreen(Color c){
  Color C = new Color (0,c.getGreen(),0);
  return C;
  }

  /*
  toBlue(c) returns a color with
     the same blue component as c
     but 0 red and 0 green.
  */
  public static Color toBlue(Color c){
  Color C = new Color (0,0,c.getBlue());
  return C;
  }

  /*
  The method drawInside is private so that it can only be used
  in this class. It is very specific to this problem.

  You do not need to add code here: it is ready to use.

  The arguments are
    x and y: the coordinates for the center of two concentric squares
    small: the size of half a side for the small square
    cb and cs: the colours for the big square and the small square

  It draws first the big square and then the small square using
  their colors.
  */
  private static void drawInside( double x, double y, double small,
                                  Color cb, Color cs )
  {
    StdDraw.setPenColor(cb);
    StdDraw.filledSquare(x,y,2*small);
    StdDraw.setPenColor(cs);
    StdDraw.filledSquare(x,y,small);
  }

  /*
  The program.
  You have to add code and replace code where indicated.
  */
  public static void main(String[] args) {
    int r1 = Integer.parseInt(args[0]);
    int g1 = Integer.parseInt(args[1]);
    int b1 = Integer.parseInt(args[2]);
    int r2 = Integer.parseInt(args[3]);
    int g2 =Integer.parseInt(args[4]);
    int b2 = Integer.parseInt(args[5]);
    Color c1= new Color(r1,g1,b1);
    Color c2 = new Color(r2,g2,b2);

    StdDraw.setXscale(0,3);
    StdDraw.setYscale(0,3);

    // Your code here
    // Replace StdDraw.BLACK and StdDraw.WHITE with the input colors
    drawInside(1.5, 1.5, 0.25, c1 , c2);
    // Your code here
    // Replace StdDraw.BLACK and StdDraw.WHITE with the gray variants of the input colors
    drawInside(0.5, 0.5, 0.25, Luminance.toGray(c1),Luminance.toGray(c2));
    // Your code here
    // Replace StdDraw.BLACK and StdDraw.WHITE with the red variants of the input colors
    drawInside(0.5, 2.5, 0.25, toRed(c1),toRed(c2));
    // Your code here
    // Replace StdDraw.BLACK and StdDraw.WHITE with the green variants of the input colors
    drawInside(2.5, 2.5, 0.25,  toGreen(c1),toGreen(c2));
    // Your code here
    // Replace StdDraw.BLACK and StdDraw.WHITE with the blue variants of the input colors
    drawInside(2.5, 0.5, 0.25, toBlue(c1), toBlue(c2));

  }
}
