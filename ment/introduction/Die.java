package ment.introduction;
import java.util.Random;

public class Die {
    private int sides;      // Numbers of sides
    private int value;      // The die's value;

    /**
     * The constractor performs an initial roll of the die.
     * @param sides for the die
     */
    public Die(int sides) {
        this.sides = sides;
        roll();
    }

    /**
     * The roll method simulates teh rolling of the die
     */
    public void roll(){
        // Create a Random object
        Random random = new Random();

        // Get a random value form the die.
        this.value = random.nextInt(sides) + 1;
    }

    /**
     * getValue method
     * @return The number of value of the die
     */

    public int getValue(){
        return value;
    }

    /**
     * getSides method
     * @return the number of sides for the die.
     */
    public int getSides(){
        return sides;
    }

}
