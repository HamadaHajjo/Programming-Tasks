/*
The program reads two command line arguments:
   - The name of a file from the command line.
     The file should be a PNG, GIF, or JPEG file containing an image.
   - A double alpha in the interval [0, 1]

The program creates a Picture with the image in the file and mixes
the color in each pixel with white. The command line argument alpha
is the factor for white in the mix.

The program shows the ligther image in a window.

e7.png is the result saving the image shown after running
java E7 baboon.jpg 0.5

(the file baboon.jpg was included in the zip file).

Your task is to complete the code for the methods lighter
and main.

You should use the method mix defined in E2.java
to calculate the mix of two colors.
*/
import java.awt.Color;
public class E7{

    public static void lighter(Picture pic, double alpha){
      int w = pic.width();
      int h = pic.height();
      Color c = new Color(255,255,255);
      for (int x = 0;x <w ; x++ ) {
       for (int y =0 ;y<h ;y++ ) {
      pic.set(x,y,(E2.mix(alpha,pic.get(x,y),c)));
     }
     }
      pic.show();
     }

    public static void main(String[] args) {
    Picture p = new Picture(args[0]);
     Double alpha= Double.parseDouble(args[1]);
     lighter(p,alpha);
    }
}
