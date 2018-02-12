//Implements a class for a pair of six sided dice

package Games.Dice;

import javafx.util.Pair;
import stdlib.StdOut;
import stdlib.StdRandom;

public class SixSiders {
    private int die1, die2;

    public SixSiders() { roll(); }

    public void roll() {
        //rolls the dice created
       die1 = StdRandom.uniform(1, 7);
       die2 = StdRandom.uniform(1, 7);
    }

    public int value() {
        //returns sum of dice
        return die1 + die2;
    }

    public int getDie1() {
        //returns value of die 1
        return die1;
    }

    public int getDie2() {
        //return value of die 2
        return die2;
    }

    public boolean isDoubles(){
        //return true if dice roll is doubles
        return die1 == die2;
    }

    private static void testValue(SixSiders testSixSiders){

        testSixSiders.roll();
        int sum = testSixSiders.getDie1() + testSixSiders.getDie2();

        if (testSixSiders.value() == sum)
            StdOut.format("%d is the same as %d", testSixSiders.value(),sum);
    }

    private static void testIsDoubles(SixSiders testSixSiders){
        //Todo: implement testIsDouble

        testSixSiders.roll();
        int die1 = testSixSiders.getDie1();
        int die2 = testSixSiders.getDie2();
        boolean flag = testSixSiders.isDoubles();

        StdOut.format("The Value of die 1 & 2 is, %d and %d",die1,die2);
        StdOut.println("The value of isDoubles is " + flag);

    }

    public static void main (String [] args){

        SixSiders PairOfDice = new SixSiders();

        testValue(PairOfDice);


    }














}