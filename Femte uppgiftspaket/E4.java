/*
The class Picture has to be in the same directory as this program.
It is included in the zip file.

The program reads two integer values w and h from the command line
and creates a picture of size w x h with random colors.

A random color is a color with random red, green and blue components.

The program ends by showing the picture in a window.

The file e4.png is the result of saving the picture shown
by running

java E4 500 300
*/
import java.awt.Color;
public class E4{
  public static void main(String[] args) {
    int w = Integer.parseInt(args[0]);
    int h = Integer.parseInt(args[1]);
    Picture p = new Picture (w,h);

  for (int i = 0; i< w  ;i ++ ) {
    for (int x = 0; x< h ;x++ ) {
      int red = (int) (Math.random()*255)+1;
      int blue = (int) (Math.random()*255)+1;
      int green = (int) (Math.random()*255)+1;
      Color c = new Color(red,blue,green);
      p.set(i,x,c);
  }
}
p.show();
  }
}
