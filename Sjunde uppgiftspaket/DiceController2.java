/*
  This is exercise 7.

  Copy the code from DiceController.java and modify the code so that
  it works with DiceView2 instead of DiceView.

*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController2 implements ActionListener{

  // The instance variables
private DiceModel diceModel;
private DiceView2 diceView2;

  // The constructor
public DiceController2(DiceModel cm, DiceView2 cv){
  diceModel = cm;
  diceView2= cv;
  System.out.println(diceModel.read());
}
  // The method actionPerformed
public void actionPerformed(ActionEvent e){
  diceModel.roll();
  diceView2.repaint();
  System.out.println(diceModel.read());
}
}
