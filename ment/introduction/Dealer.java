package ment.introduction;

public class Dealer {
    private int die1Value;  // The Value of die #1
    private int die2Value;  // The value of die #2

    /**
     * Constructor
     */
    public Dealer(){
        this.die1Value = 0;
        this.die2Value = 0;
    }

    /**
     * The rollDice method rolls the dice and saves their values.
     */
    public void rollDice() {
        final int sid_num = 6;

        // Create the two dice.
        Die die1 = new Die(sid_num);
        Die die2 = new Die(sid_num);

        // Record their values.
        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    /**
     * The getChoOrHan method returns the result of the dice
     * roll, cho or han.
      * @return Either "cho (even) or "han (odd)"
     */
    public String getChoOrHan(){
        String result;  // To hold the result

        // Get the sum of the dice.
        int sum = die1Value + die2Value;

        // Determine even or odd
        if(sum % 2 == 0){
            result = "Cho (even)";
        }
        else {
            result = "Han (Odd)";
        }

        return result;
    }

    /**
     * The getDie1Value method returns the value of die #1
     */
    public int getDie1Value(){
        return die1Value;
    }

    /**
     * The getDie2Value method returns the value of die #1
     */
    public int getDie2Value(){
        return die2Value;
    }
}
