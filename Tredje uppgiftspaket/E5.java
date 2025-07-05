/*
Above average.
According to the course book, 90% of incoming college students
rate themselves as above average.

This program that takes a command-line argument n,
reads in n integers from standard input,
and prints the fraction of values that are strictly above the average
value.

Example of use including expected output:

java E5 10
1 2 3 4 5 6 7 8 9 10
5 of 10 values were above the average 5.5

*/

/*
Your task is to complete the program under
  // Your code here

The program will need to store the values read from standard input
because it needs to go throught the values again after calculating
the average.
*/

import java.util.Scanner;
import java.util.Arrays;
public class E5{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("How many grades will be in your array? ");
    int n = s.nextInt();

    int arr[] = new int[n];
    int sum = 0;

    System.out.println("Enter the grades:");
    for(int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
      sum = sum + arr[i];
    }

    System.out.println("You entered the grades: " + Arrays.toString(arr));
    // I only used java.util.Arrays in order to get the length of it and
    // to convert it into string to make it more clear for me and for the user :)

    double average = sum / arr.length;
    System.out.println("The average of the grades is: " + average);

    System.out.println("The numbers in the array that are greater than the average are: ");
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > average) {
        System.out.println(arr[i]);
      }
    }
  }
}
