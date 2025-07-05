/*
The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program creates a Picture with the image in the file,
complements the color in each position and shows the complement
image on a window.

e6.png is the result saving the image shown after running
java E6 baboon.JPEG

(the file baboon.jpg was included in the zip file).

Your task is to complete the code for the methods complement
and main.

You should use the method complement defined in E3.java
to calculate the complement of a Color.
*/



import java.awt.Color;
public class E6{

    public static void complement(Picture pic){
    int w = pic.width();
      int h = pic.height();
        for (int x = 0;x <w ; x++ ) {
          for (int y =0 ;y<h ;y++ ) {
       pic.set(x,y,(E3.complement(pic.get(x,y))));
      }
    }
    pic.show();
  }

    public static void main(String[] args) {
    Picture p = new Picture(args[0]);
    complement(p);
    }
}
