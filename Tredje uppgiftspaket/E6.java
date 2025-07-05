/*
The program uses standard input to read
  two integers N and M
and
  N times M integers between 1 and 6.
(This is how the output of exercise E1 looks like: every M integers are
a simulation of throwing M dices).

The program prints the sum of dices in trials that occurrs more often
and how often it occurs.

Example:
java E6
5 3
1 2 3
2 3 4
4 3 2
3 4 5
5 6 6
The most frequent sum is 9
It occurrs 2 times.

Example using the output of E1 as standard input:
java E1 1000 3 | java E6
The most frequent sum is 9
It occurrs 128 times.

*/

/*
Your task is to complete the program.

Hint: Use an array where the indices are the possible sums
that can be achieved in a trial.
For example, if the simulation uses 3 dices the sum of the
three dices can be at most 18. For this case the program
can use an array with 19 places so that even place 18 exists.
In each place you can count how many times that value (the place)
occurs in the sequence of trials.

*/


import java.util.Scanner;
public class E6{
  public static void main(String[] args) {
      Scanner data = new Scanner (System.in);
      int forsok = data.nextInt();
      int kast = data.nextInt();
      int[] total = new int [kast*6+1];
      for (int i =0; i < forsok; i++){
        int value = 0;
        for (int x = 0; x < kast; x++){
          value = value + data.nextInt();
        }
        total[value]++;
      }
      int max = 0;
      for (int l = 0; l < kast*6+1; l++){
        if(total[l] > total[max]){
          max = l;
        }
      }
      System.out.println("The most frequent sum is " + max);
      System.out.println("It occurs " + total[max] + " times.");
  }
}
