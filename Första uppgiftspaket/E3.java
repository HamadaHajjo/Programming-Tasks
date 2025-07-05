/*

Add code that exchanges the values of the variables a and b.

*/

public class E3{

  public static void main(String[] args) {

    int a = 2;
    int b = 4;
    int temp;
    System.out.println("The value of a is " + a);
    System.out.println("and the value of b is  " + b);

temp=a;
a=b;
b=temp;

    System.out.println("The value of a is now " + a);
    System.out.println("and the value of b is now " + b);

  }

}
