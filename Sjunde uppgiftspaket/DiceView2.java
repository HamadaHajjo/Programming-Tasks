/*

  This is exercise 6.

  Program a datatype DiceView2 that instead of text uses images
  to show the result of rolling a dice.

  Among the files for this week you got 6 freely distributed .gif files
  containing images of the 6 sides of a dice.

  Images can be displayed on a JLabel displaying an ImageIcon.
  To create a JLabel you can use the constructor as in:
    new JLabel(new ImageIcon(  filename  ))
  refering to a file with an image.
  To change the image in a JLabel you can use the method setIcon as in
    .setIcon(new ImageIcon( filename ))

   We suggest that you
    - add an instance variable of type JLabel,

    - create a JLabel in the constructor for DiceView2 and assign it to the
      instance variable,
    - add the JLabel to this (yes, a JPanel can have components, like a JFrame)
      also in the constructor,
    - use the color with components 0, 100, 0 for the JPanel
       (also in the constructor),

    - update the image in the JLabel in the paintComponent method.

   You can do all this by modifying the code for DiceView.
   You need to remove the parts about fonts and drawString.
   Copy the content of DiceView.java to this file and do the modifications.


*/

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Graphics;

public class DiceView2 extends JPanel{

  private DiceModel d;
  private JLabel label;

  public DiceView2(DiceModel dm){
  d = dm;
  setBackground(new Color(0,100,0));
  setOpaque(true);
  label = new JLabel(new ImageIcon("dice" + dm.read() + ".gif"));
  this.add(label);
  }

  public void paintComponent(Graphics g){
  super.paintComponent(g);
  label.setIcon(new ImageIcon("dice" + d.read() + ".gif"));
  this.add(label);
  }
}
