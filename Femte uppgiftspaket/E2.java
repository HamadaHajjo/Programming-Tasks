/*
The program demonstrates the effect of mixing two colors.
It uses a static method mix and draws 10 rectangles where
more and of the second color is added to the mix.

Your task is to complete the method mix.

The image e2.png shows the result of running
java E2
*/

import java.awt.Color;
public class E2{

  /*
  The method takes three arguments:
   - alpha: a number in the interval [0, 1]
   - c1 and c2: two colors
  The method returns a color that is the result
  of mixing c1 and c2.
  The result of mixing has components calculated using the
  components of c1 and of c2:
    each component in the resulting color is the sum of
       alpha * the corresponding component in c1
       plus
       (1-alpha) * the corresponding component of c2.

  */
  public static Color mix(double alpha, Color c1, Color c2){
  double R =  (c1.getRed()*alpha + (1-alpha)*c2.getRed() );
  double B = (c1.getBlue()*alpha + (1-alpha)*c2.getBlue() );
  double G = (c1.getGreen()*alpha + (1-alpha)*c2.getGreen() );
  return new Color ((int)R , (int) G, (int) B);
  }

  /*
  Test of the method to mix black and white with 10
  different avalues of alpha: 1, 0.9, 0.8, 0.7 etc.
  */
  public static void main(String[] args){
    Color col1 = new Color(0,0,0);
    Color col2 = new Color(255,255,255);
    Color c;
    for (int i = 0; i < 10 ; i++) {
        c = mix(0.1*(10 - i), col1, col2);
        StdDraw.setPenColor(c);
        StdDraw.filledRectangle(0.1*(i+1),0.5,0.1, 0.5);
    }
  }

}
