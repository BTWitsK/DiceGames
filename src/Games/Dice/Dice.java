import stdlib.StdRandom;
import stdlib.StdOut;

public class Dice {
    private int die1, die2;

    public Dice() {
        roll();
    }

    public void roll() {
        //rolls the dice just created
       die1 = StdRandom.uniform(1, 7);
       die2 = StdRandom.uniform(1, 7);
    }

    public int value() {
        //returns value of dice
        //TODO: implement value

        return die1 + die2;
    }

    public int die1() {
        return die1;
    }

    public static void main (String [] args){

        Dice PairOfDice = new Dice();

        int x = PairOfDice.die1();

        StdOut.format("The value of die 1 is %d", x);

    }














}