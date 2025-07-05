/*
The program reads five command line arguments:
   - The name of a file from the command line.
     The file should be a PNG, GIF, or JPEG file containing an image.
   - An integer indicating a number of pixels
   - Three integers in the range [0, 255] indicating the three
     components of a color.

The program creates a Picture with the image in the file and draws
a frame (ram på svenska) over the border pixels of the image.
The color of the frame is the color with components given in the
command line. The thickness of the frame is the number of pixels
given in the command line.

The program shows the framed image in a window.

e8.png is the result saving the image shown after running
java E8 baboon.jpg 10 255 255 0

(the file baboon.jpg was included in the zip file).

Your task is to complete the program.

*/
import java.awt.Color;
public class E8{

  public static void main(String[] args) {
    Picture p = new Picture(args[0]);
    int pixel = Integer.parseInt(args[1]);
    int red = Integer.parseInt(args[2]);
    int green = Integer.parseInt(args[3]);
    int blue = Integer.parseInt(args[4]);
    Color c = new Color(red,green,blue);
    int w = p.width();
    int h = p.height();
    Picture p2 = new Picture(w,h);

    for (int i = 0; i< w ; i++ ) {
    for (int x= 0; x< h ;x++ ) {
    p2.set(i,x,c);
      }
    }
   for (int i= pixel-1; i< w-pixel ; i++ ) {
   for (int x = pixel-1; x< h-pixel ; x++ ) {
    p2.set(i,x,p.get(i,x));
      }
     }
     p2.show();
   }
  }
