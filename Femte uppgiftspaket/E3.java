/*
The program demonstrates a color and its complement.
It uses a static method complement and draws a square with
the original color and a smaller overlapped square
with the complement.

Your task is to complete the method complement.

The image e3.png shows the result of running
java E3
*/
import java.awt.Color;
public class E3{

  /*
  The method returns a color where each component is calculated
  as 255 - the corresponding component of the argument.
  */
  public static Color complement(Color c){
  double red = Math.round(255-c.getRed());
  double green = Math.round(255-c.getGreen());
  double blue = Math.round(255-c.getBlue());
  return new Color((int)red, (int)green, (int)blue);
  }

  /*
  Demonstrates the complement of red.
  */
  public static void main(String[] args) {
    Color col = new Color(255,0,0);
    StdDraw.setPenColor(col);
    StdDraw.filledSquare(0.5,0.5,0.25);
    StdDraw.setPenColor(complement(col));
    StdDraw.filledSquare(0.5,0.5,0.125);
  }

}
