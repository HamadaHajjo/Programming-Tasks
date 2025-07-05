/*
  This is the third exercise

  Complete the data type DiceView by modifying the class CounterView
  we presented in the lecture.
  (See the code in comments below the exercise)

    - Use white for the background color.
    - Write
          Your dice
      in the border.
    - Use SERIF and ITALIC instead of SANS_SERIF and BOLD for the font.
    - Make the JPanel square and not rectangular (100 x 100).
    - Make the number appears centered in the JPanel.
    - Make sure it uses a DiceModel instead of a CounterModel.

*/

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

public class DiceView extends JPanel{
 private DiceModel diceModel;
 public DiceView(DiceModel cm){
 diceModel = cm;
 setBackground(Color.white);
 Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
 Border tb = BorderFactory.createTitledBorder(b, "Your dice");
 setBorder(tb);
 setFont(new Font(Font.SERIF,Font.ITALIC,50));
 setPreferredSize(new Dimension(100,100));
}
public void paintComponent(Graphics g){
  super.paintComponent(g);
  g.setColor(Color.BLACK);
  g.drawString("" + diceModel.read(),35,70);
}
}

/*

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

public class CounterView extends JPanel{

  private CounterModel c;

  public CounterView(CounterModel cm){
    c = cm;
    setPreferredSize(new Dimension(150,100));
    setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
    setBackground(Color.MAGENTA);
    setOpaque(true);
    Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
    Border tb = BorderFactory.createTitledBorder(b, "The counter");
    setBorder(tb);
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawString("" + c.read(),40,70);
  }
}

*/
