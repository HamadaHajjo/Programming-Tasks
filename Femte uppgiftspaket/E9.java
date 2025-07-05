/*
The program reads five command line arguments:
   - The name of a file from the command line.
     The file should be a PNG, GIF, or JPEG file containing an image.

   - An integer X indicating a column number

   - An integer Y indicating a row number

   - An integer T indicating a number of pixels
     (the vertical thickness of a rectangle)

   - An integer L indicating a number of pixels
     (the horisontal length of a  rectangle)

The program creates a Picture with the image in the file and draws
a black rectangle  over the  pixels of the image that start in
the pixel X, Y and extend T pixels down and L pixels to the right.

The program shows the censored image in a window.

e9.png is the result of saving the image shown by
java E9 baboon.jpg 50 20 40 200

(the file baboon.jpg was included in the zip file).

Your task is to complete the program.
*/

import java.awt.Color;
public class E9{

  public static void main(String[] args) {
    Picture p = new Picture(args[0]);
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    int t = Integer.parseInt(args[3]);
    int l = Integer.parseInt(args[4]);

    Color c = new Color(0,0,0);

    int w= p.width();
    int h = p.height();
    int counterL=0;
    int counterT=0;

    if (w>x) {
    if (h>y) {
    for (int a = x ; counterL<l ; a++ ) {
    for (int b = y ; counterT<t ; b++ ) {
    p.set(a,b,c);
    counterT++;
  }
    counterL++;
    counterT=0;
  }
  }
  }
    p.show();
  }
  }
