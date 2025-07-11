/*

The program as you get it prints one star per proper divisor
of the number the user provides in the command line.

The proper divisors of a number are all divisors
except 1 and the number itself.

Observe that we use print and not println so that we do not
change line between stars.

Try the program with 10, 120 and 124
before you start with your task.

Your task is to modify the program so that instead it
prints one line with stars for the proper divisors
of each positive number smaller or equal than a bound
provided by the user in the command line.

To make the output more readable each line should start with the number
before the stars that count the proper divisors.

Example:
java E9 10
1:
2:
3:
4: *
5:
6: **
7:
8: **
9: *
10: **

*/
public class E9 {
public static void main(String[] cmdLn){
int k = Integer.parseInt(cmdLn[0]);
for (int a = 1; a<=k; a++){
System.out.println(a + ": ");
for(int i = 2; i < a; i++){
if (a % i == 0){
System.out.print("*");
}
}
System.out.println();
}
}
}
