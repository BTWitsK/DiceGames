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

    private static void testGetDie(SixSiders testSixSiders){

        testSixSiders.roll();

        int actualDie1 = testSixSiders.die1;
        int actualDie2 = testSixSiders.die2;

        int expectedDie1 = testSixSiders.getDie1();
        int expectedDie2 = testSixSiders.getDie2();

        String returnDice1 = String.format("Actual value of die 1:%d\n" +
                " Expected value of die1:%d\n",actualDie1,expectedDie1);

        String returnDice2 = String.format("Actual value of die 2:%d\n" +
                " Expected value of die2:%d\n",actualDie2,expectedDie2);

        if (actualDie1 != expectedDie1) StdOut.println(returnDice1);

        if (actualDie2 != expectedDie2) StdOut.println(returnDice2);




    }

    private static void testValue(SixSiders testSixSiders){

        testSixSiders.roll();
        int sum = testSixSiders.getDie1() + testSixSiders.getDie2();


        String returnString = testSixSiders.value() == sum ?
                String.format("%d is the same as %d%n",sum,testSixSiders.value()):
                "ERROR";

        StdOut.println(returnString);






    }

    private static void testIsDoubles(SixSiders testSixSiders){
        //Todo: implement testIsDouble

        testSixSiders.roll();
        boolean flag = testSixSiders.isDoubles();

        int expected = testSixSiders.value();
        int actual = testSixSiders.getDie1() + testSixSiders.getDie2();

        StdOut.format("The expected value is:%d, the actual value is %d%n"
                ,expected,actual);

        StdOut.println("The value of isDoubles is " + flag);

    }

    public static void main (String [] args){

        SixSiders PairOfDice = new SixSiders();

        testValue(PairOfDice);
        testIsDoubles(PairOfDice);



    }














}