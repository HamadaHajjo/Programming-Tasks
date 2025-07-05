/*
The library class NumericalArrays has to be in the same directory
as this program.

The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program then shows three images in three different windows:
  - The original image
  - A blured version of the image where the color in each pixel
    is a color with components obatained as the average of the
    components of the 9 colors around (and including) the pixel.
  - A sharper version of the image where the color in each pixel
    is a color with components obtained as the weighted average
    of the components of the 9 colours around (and including)
    the pixel. The weights are: 16 for the pixel itself and
     -1 for the 8 neighbours.

Your task is to complete the methods average and neighbours.

blurred.png and sharp.png are the result of saving the images
shown after running

java Bonus baboon.jpg

(the program also shows baboon.jpg)

*/

import java.awt.Color;
public class Bonus{

  private static Color average(Color[] colors, int[] weights){
    // Your code here.
    // remove return null.
    return null;
  }

  private static Color[] neighbours(int x, int y, Picture p){
    // Your code here.
    // remove return null.
    return null;
  }



  public static void main(String[] args) {
    Picture p = new Picture(args[0]);
    Picture sharp  = new Picture(p.width(),p.height());
    Picture blurry = new Picture(p.width(),p.height());
    Color[] nine = new Color[9];
    int[] ws  = new int[9];

    for (int x = 1; x < p.width()-1 ; x++) {
      for (int y = 1; y < p.height()-1 ; y++) {

          nine = neighbours(x,y,p);

          ws = NumericalArrays.repeat(9,1);
          blurry.set(x,y,average(nine, ws));

          ws = NumericalArrays.repeat(9,-1);
          ws[0]=16;
          sharp.set(x,y,average(nine,ws));
      }
    }
    p.show();
    sharp.show();
    blurry.show();
  }
}
