/*
  This is exercise 7.

  Copy the code from E5.java and modify the code so that
  it works with DiceView2 and DiceController2.

*/

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class E8{
  public static void main(String[] cmdLn){
    JFrame f = new JFrame(("Dice"));
    JButton button = new JButton("INC");
    DiceModel diceModel = new DiceModel();
    DiceView2 diceView = new DiceView2(diceModel);

      button.addActionListener(new DiceController2(diceModel, diceView));
       f.setLayout(new BorderLayout());
       f.add(diceView, BorderLayout.CENTER);
       f.add(button, BorderLayout.SOUTH);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.pack();
       f.setVisible(true);
}
}
