/*
  This is the fourth exercise

  Complete the data type DiceController by modifying the class
  CounterController we presented in the lecture.
  (See the code in comments below the exercise)

    - Make sure it uses a DiceModel and a DiceView instead of a
      CounterModel and a CounterView.
*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController implements ActionListener{
  private DiceModel diceModel;
  private DiceView diceView;
public DiceController(DiceModel cm, DiceView cv){
  diceModel = cm;
  diceView = cv;
  System.out.println(diceModel.read());
}
public void actionPerformed(ActionEvent e){
  diceModel.roll();
  System.out.println(diceModel.read());
}
}
/*

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterController implements ActionListener{

    private CounterModel c;

    public CounterController(CounterModel cm){
        c = cm;
        System.out.println(c.read());
    }

    public void actionPerformed(ActionEvent e){
        c.inc();
        System.out.println(c.read());
    }
}

*/
