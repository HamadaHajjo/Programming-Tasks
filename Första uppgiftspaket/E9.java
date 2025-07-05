/*

Add code that prints two numbers that represent the outcome of
throwing 2 dices.

Use Math.random in order to achieve a randomized behaviour.

*/

public class E9{

  public static void main(String[] args) {

    int a1= (int)(Math.random() * 6) + 1;
        int a2= (int)(Math.random() * 6) + 1;


        System.out.println("The first dice had the outcome:" + a1 + " And the second dice had the outcome:" + a2);

  }

}
