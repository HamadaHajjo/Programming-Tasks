/*
The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program creates a Picture with the image in the file,
inverts the image vertically and shows the inverted image
on a window.

e5.png is the result saving the image shown after running
java E5 baboon.JPEG

(the file baboon.jpg was included in the zip file).
*/
import java.awt.Color;
public class E5{
  public static void main(String[] args) {
        Picture p = new Picture(args[0]);
        int w = p.width();
        int h = p.height();
        Picture flip = new Picture(p);
    for (int i = 0; i< w ; i++ ) {
      for (int x=0; x< h ; x++ ) {
    Color newpic = p.get((w-i-1),(h-x-1));
      flip.set (i,x,newpic);
      }
    }
 flip.show();
 p.show();

  }
}
