/*
The class NumericalArrays is a library of methods that support programming
with arrays of numbers. It includes methods for  printing arrays,
creating arrays and doing mathematical operations with arrays.

Each of the methods is explained with a comment directly above the header of
the method.

Last in the class there is a method main that calls on all the methods to
showcase how they can be used.

Your task is to complete the implementation of all methods except linspace.

This is what should happen when running the library as a program (just
demonstrates what the functions can do). Make sure you have StdDraw in this
directory.

java NumericalArrays
0.0 0.3490658503988659 0.6981317007977318 1.0471975511965976 1.3962634015954636 1.7453292519943295 2.0943951023931953 2.443460952792061 2.792526803190927 3.141592653589793
5 5 5 5 5 5 5 5 5 5
-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9 10
0.0  3.141592653589793
-10  10
true
false
15

It should also open a StdDraw canvas!

And if you have solved the BONUS EXERCISE (runningAverage) you should also add code to main
to showcase the function on the array {1,2,3,4,5,6,7,8,9,10} with a
window of 3.
*/

public class NumericalArrays{

  /*
  Takes arguments start and stop (both doubles) with start <= stop
  and n (an integer) with n > 0.
  Returns n evenly spaced samples (doubles),
  calculated over the interval [start, stop].
  */
  public static double[] linspace(double start, double stop, int n){
    double[] lsp = new double[n];
    for (int i = 0; i < n; i++) {
      lsp[i] = start + i * Math.abs(stop-start) / (n - 1);
    }
    return lsp;
  }

  /*
  Prints the elements of an array of doubles to standard output.
  The argument is an array of doubles.
  The elements are printed on one line separated by a white space
  A new line is introduced to standard output after the last element.
  */
  public static void println(double[] numarray){
    for (int i =0; i< numarray.length ; i++ ) {
       System.out.print(numarray[i]+" ");
     }
    System.out.println();
  }

  /*
  Prints the elements of an array of integers to standard output.
  The argument is an array of integers.
  The elements are printed on one line separated by a white space
  A new line is introduced to standard output after the last element.
  */
  public static void println(int[] numarray){
    for (int i =0; i< numarray.length ; i++ ) {
      System.out.print(numarray[i]+" ");
    }
    System.out.println();
  }

  /*
  Takes 2 integer arguments, a and b, with a <= b.
  Returns an array of integers with all the values in [a,b].
  */
  public static int[] range(int a, int b){
    int []array= new int [Math.abs(b-a)+1];
    for (int i = 0 ; i< array.length ; i++ ) {
      array[i]= a+i;
    }
    return array;
  }

  /*
  Takes 2 integer arguments, n and a with n > 0.
  Returns the array of integers of length n with value a in all positions.
  */
  public static int[] repeat(int n, int a){
    int []array= new int [n];

    for (int i =0 ; i< n ; i++ ) {
      array[i]=a;
  }
     return array;
}
  /*
  Returns the smallest value in the  array of doubles it gets as argument.
  */
  public static double min(double[] numarray){
    int index=0;
    double minimum = numarray[0];
    for (int i =0 ; i< numarray.length ;i++ ) {
      if(numarray[i]<minimum){
        minimum = numarray[i];
        index=i;
      }
    }
    return numarray[index];
  }
  /*
  Returns the largest value in in the  array of doubles it gets as argument.
  */
  public static double max(double[] numarray){
    int index=0;
      double maximum = numarray[0];
      for (int i =0 ; i< numarray.length ;i++ ) {
        if(numarray[i]>maximum){
          maximum = numarray[i];
           index= i;
        }
      }
      return numarray[index];
    }
  /*
  Returns the smallest value in in the  array of ints it gets as argument.
  */
  public static int min(int[] numarray){
    int index=0;
    double minimum = numarray[0];
    for (int i =0 ; i< numarray.length ;i++ ) {
    if(numarray[i]<minimum){
    minimum = numarray[i];
    index=i;
  }
  }
  return numarray[index];
  }

  /*
  Returns the largest value in in the  array of ints it gets as argument.
  */
  public static int max(int[] numarray){
    int index=0;
    double maximum = numarray[0];
    for (int i =0 ; i< numarray.length ;i++ ) {
      if(numarray[i]>maximum){
        maximum = numarray[i];
         index= i;
      }
    }
    return numarray[index];
  }

  /*
  Returns the addition of all the values in he array of doubles it gets
  as argument.
  */
  public static double sum(double[] numarray){
    double sum=0;
  for (int i = 0; i<= numarray.length ;i++ ) {

    sum += numarray[i];
  }
  return sum;
  }

  /*
  Returns the addition of all the values in the array of ints it gets
  as argument.
  */
  public static int sum(int[] numarray){
  int sum=0;
  for (int i = 0; i< numarray.length ;i++ ) {
  sum += numarray[i];
  }
  return sum;
  }

  /*
  Returns the average of the values in the array of doubles it gets as
  argument.
  */
  public static double average(double[] numarray){
  return sum(numarray) / numarray.length;
  }

  /*
  Returns the standard deviation of the values in the array of doubles
  it gets as argument.
  */
  public static double standardDeviation(double[] numarray){
    double avrg = average(numarray);
       double variance = 0;
       for (int i = 0; i < numarray.length; i++){
         variance = variance + (numarray[i] - avrg) * (numarray[i] - avrg);
       }
       variance /= numarray.length;
       return Math.sqrt(variance);
  }



  /*
  Returns the dot product between two arrays of doubles of the same length.
  The arguments are two arrays of doubles, a and b, that have the same
  number of elements.
  The result is the dot product: a0*b0 + a1*b1 + ... + an*bn
  */
  public static double dotproduct(double[] a, double[] b){
    if(a.length==b.length){
    double sum =0;
    for (int i =0;i <b.length ; i++ ) {
      sum+= (a[i]*b[i]);
    }
     return sum;
  }
    return 0;
  }

  /*
  Takes to arrays of doubles, a and b, and returns the boolean value true
  if and only if the arrays are equaly long and have the same values in
  the same order. In all other cases returns false.
  */
  public static boolean equal(double[] a, double[] b){
    if (a.length == b.length) {
     for (int i = 0; i < b.length; i++) {
       if (a[i] != b[i]) {
         return false;
       }
       else {
         return true;
       }
     }
     return true;
   }
   return false;
  }

  /*
  Takes to arrays of doubles, a and b, and returns the boolean value true
  if and only if the arrays are equaly long and have the same values in
  the same order. In all other cases returns false.
  */
  public static boolean equal(int[] a, int[] b){
    if (a.length == b.length) {
   for (int i = 0; i < b.length; i++) {
       if (a[i] != b[i]) {
         return false;
       }
       else {
         return true;
       }
     }
     return true;
   }
   return false;
  }


  /*
  Plots the elements of the array as points using the course books StdDraw.
  For each element in the array we draw a point with the position in the array
  as x-value and the value in that position as y-value.
  The scale is set to: on the x-dimension [-1, length] and on the
  y-dimension [minimum in array - 0.1, maximum in array + 0.1].
  The pen colour and the pen radius are set by the program that uses this method,
  they should not be set in the method.
  */
  public static void plot(double[] numarray){
    StdDraw.setXscale(-1, numarray.length);
    StdDraw.setYscale(min(numarray)-0.1, max(numarray)+0.1);
    for (int i =0;i <numarray.length ;i++ ) {
      StdDraw.point(i,numarray[i]);
    }
  }

  /*
  Plots the elements of the array as points using the course books StdDraw.
  For each element in the array we draw a point with the position in the array
  as x-value and the value in that position as y-value.
  The scale is set to: on the x-dimension [-1, length] and on the
  y-dimension [minimum in array - 1, maximum in array + 1].
  The pen colour and the pen radius are set by the program that uses this method,
  they should not be set in the method.
  */
  public static void plot(int[] numarray){
    StdDraw.setXscale(-1, numarray.length);
      StdDraw.setYscale(min(numarray)-1, max(numarray)+1);
      for (int i =0;i <numarray.length ;i++ ) {
        StdDraw.point(i,numarray[i]);
      }
  }

  /*
  BONUS EXERCISE
  Running (or moving) average.
  From the wikipedia:
    Given a series of numbers and a fixed subset size,
    the first element of the moving average is obtained
    by taking the average of the initial fixed subset of the number series.
    Then the subset is modified by "shifting forward";
    that is, excluding the first number of the series
    and including the next value in the subset.

  We call the fixed subset size a window.

  Complete the definition of the method running average.
  */
  public static double[]  runningAverage(double[] values, int window){

    double[] simple = new double[values.length-(window-1)];
     for (int i = 0; i < simple.length; i++){
       double sum = 0.0;
       for (int x = i; x < window + i; x++){
         sum += values[x];
       }
       simple[i] = sum / window;
     }
     return simple;
  }


  /*

  The program showcases all the methods implemented in the class.
  To use these methods in other programs the class NumericalArrays
  has to be in the same directory as the other program and
  the methods are called prefixing NumericalArrays. as in
  NumericalArrays.println(x)

  If you have solved the Bonus part (runningAverage) you have to add code
  at the end of main to showcase your method with the array
  {1,2,3,4,5,6,7,8,9,10} and window 3.

  */
  public static void main(String[] args) {
    double[] x = linspace(0, Math.PI, 10);
    println(x);

    int[] a = repeat(10, 5);
    println(a);

    a = range(-10,10);
    println(a);

    System.out.println(min(x) + "  " + max(x));
    System.out.println(min(a) + "  " + max(a));

    System.out.println(equal(x, linspace(0,Math.PI,10)));
    System.out.println(equal(repeat(3,5), range(3,5)));

    System.out.println(sum(repeat(3,5)));

    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(StdDraw.BLACK);
    plot(x);

    // draw the coordinates in the canvas for x.
    StdDraw.setPenColor(StdDraw.RED);
    for(int i = 1; i < 4; i++){
        StdDraw.point(0,i);
    }
    for(int i = 1; i < 10; i++){
        StdDraw.point(i,0);
    }
    double[] values = {1,2,3,4,5,6,7,8,9,10};
    int window = 3;
    println(runningAverage(values,window));
  }
}
