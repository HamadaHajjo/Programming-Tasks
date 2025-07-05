/*
Sten-Sax-Paase:

The user inputs Rock, Scissors or Bag.
The program randomly chooses one of these:
   suggestion: use 0 for Rock, 1 for Scissors and 2 for Bag.

The program outputs what the user says, what the program says
and who wins:
    either "You win!" if the user wins
    or     "I win!" if  the program wins
    or     "We are even!" if both picked the same object.

To decide what to do depending on the user input use a switch statement on
the string userSays. There are three interesting cases:
    "Rock", "Scissors" and "Bag"
*/

public class E3
{
   public static void main(String[] args)
   {

      int compChoiceInt = (int) (Math.random() * 3);
      System.out.print("Please enter an integer between 0 and 2 to play ( 0 = Rock 1 = Paper 2 = Scissors): ");
      int user = Integer.parseInt(args[0]);

switch (compChoiceInt){
case 0: System.out.println("The computer chose Rock!");
switch (user){
case 0: System.out.println("You chose Rock! It's a draw!"); break;
case 1: System.out.println("You chose Paper! You win!"); break;
case 2: System.out.println("You chose Scissors! You loose!"); break;
}
break;
case 1: System.out.println("The computer chose Paper!");
switch (user){
case 0: System.out.println("You chose Rock! You loose!"); break;
case 1: System.out.println("You chose Paper! It's a draw!"); break;
case 2: System.out.println("You chose Scissors! You win!"); break;
}
break;
case 2: System.out.println("The computer chose Scissors!");
switch (user){
case 0: System.out.println("You chose Rock! You win!"); break;
case 1: System.out.println("You chose Paper! You loose!"); break;
case 2: System.out.println("You chose Scissors! It's a draw"); break;
}
break;
}

}
}
