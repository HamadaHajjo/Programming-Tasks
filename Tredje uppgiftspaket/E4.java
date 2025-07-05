/*
The program reads a sequence of integers and prints back out
the integers to standard output, except that it removes repeated
values if they appear consecutively.

For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1,
your program should print out 1 2 1 5 1 7 1.

*/

/*

Your task is to complete the program after
 // Your code here

 ** Optional: **
 ***************
 If the user presses Ctrl D without providing any numbers the program
 has nothing to do: there should be no output and the program should
 terminate quitely.

  Make sure your program has this behaviour.
*/
import java.util.Scanner;
public class E4{
  public static void main(String[] args) {
      Scanner data = new Scanner(System.in);
      int i = 0;
      int y = i;

      if (data.hasNextInt()){
        i = data.nextInt();
        y = i;
        System.out.print(i + " ");
      }

      while (data.hasNextInt()){
        i = data.nextInt();
        if(i == y){

        }
        else{
          System.out.print(i + " ");
          y = i;
        }
      }
  }
}
