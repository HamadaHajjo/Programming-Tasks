/*

  Complete the class E5 by modifying the class CounterMain that
  we presented in the lecture.
  (See the code in comments below the exercise)

  Make sure to use a DiceModel, a DiceView and a DiceController.
*/

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class E5{
  public static void main(String[] cmdLn){
  JFrame f = new JFrame(("Dice"));
  JButton button = new JButton("INC");
  DiceModel diceModel = new DiceModel();
  DiceView diceView = new DiceView(diceModel);

  button.addActionListener(new DiceController(diceModel, diceView));
    f.setLayout(new BorderLayout());
    f.add(diceView, BorderLayout.CENTER);
    f.add(button, BorderLayout.SOUTH);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
}
}


/*

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class CounterMain{
  public static void main(String[] cmdLn){
    JFrame f = new JFrame("Counter");
    JButton count = new JButton("INC");

    CounterModel c = new CounterModel();
    CounterView cv = new CounterView(c);

    count.addActionListener(new CounterController(c, cv));

    f.setLayout(new BorderLayout());
    f.add(count, BorderLayout.SOUTH);
    f.add(cv, BorderLayout.CENTER);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);

  }
}

*/
