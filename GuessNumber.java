package com.company;
import java.util.Scanner;
import java.util.Random;
class GuessNumber
{
    private int num;
    private int user_num;
    private int noOfGuesses = 10;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    public GuessNumber()
    {
        num = rand.nextInt(100);
        user_num = sc.nextInt();
    }
    public void start()
    {
        while(noOfGuesses > 0)
        {
          if(user_num == num)
          {
              System.out.println("You guess the correct number");
              break;
          }
          else if(user_num < num)
          {
              System.out.println("You guess the smaller number !PLease guess a larger number");
              System.out.format("Chances left %d \n", noOfGuesses);

          }
          else
          {
              System.out.println("You guess a larger number !PLease guess a smaller number");
              System.out.format("Chances left %d\n" , noOfGuesses);
          }
          user_num = sc.nextInt();
          noOfGuesses--;
          if(noOfGuesses == 0)
          {
              System.out.println("Sorry you loss!");
          }
        }
    }
}
public class gg_java
{
    public static void main(String[] args)
    {
        System.out.println("This is a GuessThe Number game\nYou have ten chances\nGuess the number between 0 to 100");
        GuessNumber go = new GuessNumber();
        go.start();
        System.out.println("-----------------------------------");
        GuessNumber harry = new GuessNumber();
        harry.start();
    }


}
